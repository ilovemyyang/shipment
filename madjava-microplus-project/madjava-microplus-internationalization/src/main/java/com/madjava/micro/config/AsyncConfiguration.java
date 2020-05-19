package com.madjava.micro.config;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class AsyncConfiguration {

	public static final String SEND_SQL_LOG_EXECUTOR = "syncSQLLogExecutor";
	private static final String SEND_SQL_LOG_PREFIX = "SEND-SQL-LOG-";
	private static final int POOL_SIZE = (int) (Runtime.getRuntime().availableProcessors());

	@Bean
	public Executor syncSQLLogExecutor() {
		final ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setMaxPoolSize(POOL_SIZE);
		executor.setCorePoolSize(POOL_SIZE);
		executor.setQueueCapacity(Integer.MAX_VALUE);
		executor.setThreadNamePrefix(SEND_SQL_LOG_PREFIX);
		return executor;
	}

}
