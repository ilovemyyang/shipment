package com.madjava.micro.database.mybatis.strategy.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlOutputVisitor;
import com.madjava.micro.database.mybatis.strategy.TableNameAlterStrategy;

@Component
public class DruidTableNameAlterStrategyImpl implements TableNameAlterStrategy {
	private static final Logger LOG = Logger.getLogger(DruidTableNameAlterStrategyImpl.class.getName());
	
	private Map<String, Object> tableNames = new HashMap<>();

	@Override
	public void setTableNames(List<String> replaceTables) {
		this.tableNames.clear();
		for (String key : replaceTables) {
			this.tableNames.put(key, null);
		}
	}

	/**
	 * Replace table name.
	 *
	 * @param sql the sql
	 * @param postfix the postfix
	 * @return the string
	 */
	@Override
	public String replaceTableName(String sql, String postfix) {
		LOG.log(Level.FINER, sql);
		String newFix = "_" + postfix;
		StringBuilder out = new StringBuilder();
		MySqlOutputVisitor visitor = new MySqlOutputVisitor(out);
		visitor.setPrettyFormat(false);
		MySqlStatementParser parser = new MySqlStatementParser(sql);
		List<SQLStatement> statementList = parser.parseStatementList();
		DruidTableNameVisitor tnm = new DruidTableNameVisitor(this.tableNames, newFix);
		for (SQLStatement statement : statementList) {
			statement.accept(tnm);
			statement.accept(visitor);
		}
		return out.toString();
	}
}
