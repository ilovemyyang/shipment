package com.madjava.micro.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.flywaydb.core.Flyway;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

/**
 * The Class FlywayConfig.
 */
@Configuration
public class FlywayConfig implements BeanPostProcessor {

	@Value(value="${database.auto.update.sites:base}")
	private String sites;

	@Value(value="${database.auto.update.disable:false}")
	private boolean disable;
	
	/**
	 * Post process after initialization.
	 * 在启动时自动初始化数据库到最新版本
	 * @param bean the bean
	 * @param beanName the bean name
	 * @return the object
	 * @throws BeansException the beans exception
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		if (bean instanceof DataSource) {
			if(disable || sites == null || sites.trim().isEmpty()) {
				return bean;
			}
			
			String[] siteList = sites.split(",");

			for (String site : siteList) {
				Map<String, String> placeMap = new HashMap<>();
				placeMap.put("tanent", "_" + site);
				if ("base".equals(site)) {
					placeMap.put("tanent", "");
				}
				Flyway flyway = Flyway.configure().dataSource((DataSource) bean).table("schema_history_" + site)
						.placeholderPrefix("_${").placeholderSuffix("}").baselineOnMigrate(true).placeholders(placeMap)
						.locations("db/migration").baselineOnMigrate(true).load();
				flyway.migrate();
			}
		}

		return bean;

	}

}
