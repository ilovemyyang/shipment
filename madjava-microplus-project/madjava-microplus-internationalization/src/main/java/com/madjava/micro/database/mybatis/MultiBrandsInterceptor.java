package com.madjava.micro.database.mybatis;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.madjava.micro.data.ThreadLocalData;
import com.madjava.micro.database.mybatis.strategy.TableNameAlterStrategy;
import com.madjava.micro.dto.sqllog.SQLLogData;
import com.madjava.micro.dto.sqllog.SQLLogPayloadData;
import com.madjava.micro.service.SQLLogSendService;
import com.madjava.micro.service.SessionService;

/**
 * The Class MultiBrandsInterceptor. 拦截SQL语句, 更改表名为表名+"_"+siteId
 * 当Mybatis设置查询缓存时, 需要更新缓存的KEY 表名为直接替换, 并不会去解析SQL语句
 */
@Component
@Intercepts({
		@Signature(type = Executor.class, method = "query", args = { MappedStatement.class, Object.class,
				RowBounds.class, ResultHandler.class }),
		@Signature(type = Executor.class, method = "query", args = { MappedStatement.class, Object.class,
				RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class }),
		@Signature(type = Executor.class, method = "update", args = { MappedStatement.class, Object.class }) })
public class MultiBrandsInterceptor implements Interceptor, InitializingBean {

	/** The Constant LOG. */
	private static final Logger LOG = Logger.getLogger(MultiBrandsInterceptor.class.getName());

	/** The replace tables. */
	private List<String> replaceTables = new ArrayList<>();

	/** The enable flag to replace sql. */
	private boolean enable = false;

	/** The replace string. */
	@Value("${spring.application.name:NONE}")
	private String applicationName;

	/** The replace string. */
	@Value("${mybatis.table.replace:NONE}")
	private String replaceString;

	/** The monitoring flag. */
	@Value("${mybatis.sql.mornitoring:true}")
	private boolean monitoring;

	/** The session service. */
	@Autowired
	private SessionService sessionService;

	@Autowired
	private TableNameAlterStrategy tableNameAlterStrategy;

	@Autowired
	private SQLLogSendService logSendService;

	/**
	 * 拦截方法
	 * 
	 * @param invocation the invocation
	 * @return the object
	 * @throws Throwable the throwable
	 */
	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		String postfix = getPostfixFromSession();
		String sql = null;

		if (!StringUtils.isEmpty(postfix)) {
			BoundSql boundSql = getSqlByInvocation(invocation);
			sql = tableNameAlterStrategy.replaceTableName(boundSql.getSql(), postfix);
			resetSqlAndCacheKey(invocation, boundSql, sql);
		} else {
			LOG.log(Level.FINER, "skip as no siteId/conf");
		}

		if (monitoring) {
			if (sql == null) {
				sql = getSqlByInvocation(invocation).getSql();
			}

			SQLLogPayloadData payload = new SQLLogPayloadData();
			payload.setApplicationName(applicationName);
			payload.setSql(sql);
			payload.setSiteId(postfix);
			long start = System.currentTimeMillis();
			payload.setStartTime(String.valueOf(start));
			Object obj = invocation.proceed();
			payload.setExcutedTime(System.currentTimeMillis() - start);
			SQLLogData logData = new SQLLogData(payload);
			logSendService.sendSqlLog(logData);
			return obj;
		}

		return invocation.proceed();
	}

	/**
	 * 拿到当前的siteID
	 * 
	 * @return the postfix from session
	 */
	private String getPostfixFromSession() {
		String postfix = null;
		if (replaceTables.isEmpty()) {
			return postfix;
		}
		ThreadLocalData data = sessionService.getSessionData().orElse(null);
		if (data != null) {
			postfix = data.getSiteId();
		}
		return postfix;
	}

	/**
	 * 替换SQL (已经不使用)
	 *
	 * @param sql     the sql
	 * @param postfix the postfix
	 * @return the string
	 */
	protected String replaceSql(String sql, String postfix) {
		String rplSql = sql.replaceAll("[\\s]+", " ").toLowerCase() + " ";
		StringBuilder srcBuilder = new StringBuilder(40);
		StringBuilder targetBuilder = new StringBuilder(40);
		for (String table : replaceTables) {
			srcBuilder.delete(0, srcBuilder.length());
			srcBuilder.append(' ').append(table).append(' ');
			targetBuilder.delete(0, targetBuilder.length());
			targetBuilder.append(' ').append(table).append('_').append(postfix).append(' ');
			rplSql = rplSql.replaceAll(srcBuilder.toString(), targetBuilder.toString());
		}
		LOG.log(Level.INFO, sql + " \n => " + rplSql);
		return rplSql;
	}

	/**
	 * Plugin.
	 *
	 * @param target the target
	 * @return the object
	 */
	@Override
	public Object plugin(Object target) {
		if (this.isEnable()) {
			return Plugin.wrap(target, this);
		}
		return target;
	}

	/**
	 * Gets the sql by invocation.
	 *
	 * @param invocation the invocation
	 * @return the sql by invocation
	 */
	private BoundSql getSqlByInvocation(Invocation invocation) {
		final Object[] args = invocation.getArgs();
		if (args.length == 6) {
			return ((BoundSql) args[5]);
		}
		MappedStatement ms = (MappedStatement) args[0];
		Object parameterObject = args[1];
		BoundSql boundSql = ms.getBoundSql(parameterObject);
		return boundSql;
	}

	/**
	 * 把SQL放回BoundSql 如果有Cache, 会更新CacheKey
	 * 
	 * @param invocation the invocation
	 * @param boundSql
	 * @param sql        the sql
	 * @throws SQLException the SQL exception
	 */
	private void resetSqlAndCacheKey(Invocation invocation, BoundSql boundSql, String sql) throws SQLException {
		final Object[] args = invocation.getArgs();
		MetaObject msObject = SystemMetaObject.forObject(boundSql);
		msObject.setValue("sql", sql);
		// reset bound sql
		if (args.length == 6) {
			// only select with cache
			args[5] = boundSql;
		} else {
			MappedStatement statement = (MappedStatement) args[0];
			MappedStatement newStatement = newMappedStatement(statement, new BoundSqlSqlSource(boundSql));
			args[0] = newStatement;
		}
		LOG.log(Level.INFO, boundSql.getSql());

		refreshCachIfNeed(invocation);
	}

	/**
	 * Refresh cach if need.
	 *
	 * @param invocation      the invocation
	 * @param args            the args
	 * @param parameterObject the parameter object
	 * @param newStatement    the new statement
	 */
	private void refreshCachIfNeed(Invocation invocation) {
		final Object[] args = invocation.getArgs();
		if (args.length != 6) {
			return;
		}

		MappedStatement statement = (MappedStatement) args[0];
		if (statement.getCache() != null) {
			// refresh cache key with new sql
			Executor executor = (Executor) invocation.getTarget();
			CacheKey cacheKey = executor.createCacheKey(statement, args[1], (RowBounds) args[2], (BoundSql) args[5]);
			args[4] = cacheKey;
		}
	}

	/**
	 * The Class BoundSqlSqlSource.
	 */
	class BoundSqlSqlSource implements SqlSource {

		/** The bound sql. */
		private BoundSql boundSql;

		/**
		 * Instantiates a new bound sql sql source.
		 *
		 * @param boundSql the bound sql
		 */
		public BoundSqlSqlSource(BoundSql boundSql) {
			this.boundSql = boundSql;
		}

		/**
		 * Gets the bound sql.
		 *
		 * @param parameterObject the parameter object
		 * @return the bound sql
		 */
		@Override
		public BoundSql getBoundSql(Object parameterObject) {
			return boundSql;
		}
	}

	/**
	 * Sets the properties.
	 *
	 * @param properties the new properties
	 */
	@Override
	public void setProperties(Properties properties) {

	}

	/**
	 * After properties set.
	 *
	 * @throws Exception the exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		if (!StringUtils.isEmpty(replaceString) && !"NONE".equals(replaceString)) {
			replaceTables.clear();
			for (String table : replaceString.split(",")) {
				replaceTables.add(table.trim().toLowerCase());
				LOG.info("Init replace table : " + table);
				setEnable(true);
			}
			if (this.isEnable()) {
				tableNameAlterStrategy.setTableNames(replaceTables);
			}

		} else {
			LOG.info("Disable MultiBrandsInterceptor");
		}
	}

	/**
	 * Checks if is enable.
	 *
	 * @return true, if is enable
	 */
	public boolean isEnable() {
		return enable;
	}

	/**
	 * Sets the enable.
	 *
	 * @param enable the new enable
	 */
	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	private MappedStatement newMappedStatement(MappedStatement ms, SqlSource newSqlSource) {
		MappedStatement.Builder builder = new MappedStatement.Builder(ms.getConfiguration(), ms.getId(), newSqlSource,
				ms.getSqlCommandType());
		builder.resource(ms.getResource());
		builder.fetchSize(ms.getFetchSize());
		builder.statementType(ms.getStatementType());
		builder.keyGenerator(ms.getKeyGenerator());
		if (ms.getKeyProperties() != null && ms.getKeyProperties().length != 0) {
			StringBuilder keyProperties = new StringBuilder();
			for (String keyProperty : ms.getKeyProperties()) {
				keyProperties.append(keyProperty).append(",");
			}
			keyProperties.delete(keyProperties.length() - 1, keyProperties.length());
			builder.keyProperty(keyProperties.toString());
		}
		builder.timeout(ms.getTimeout());
		builder.parameterMap(ms.getParameterMap());
		builder.resultMaps(ms.getResultMaps());
		builder.resultSetType(ms.getResultSetType());
		builder.cache(ms.getCache());
		builder.flushCacheRequired(ms.isFlushCacheRequired());
		builder.useCache(ms.isUseCache());

		return builder.build();
	}

}
