package com.madjava.micro.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.madjava.micro.config.AsyncConfiguration;
import com.madjava.micro.dto.sqllog.SQLLogData;

@Component
public class SQLLogSendService {
	/** The Constant LOG. */
	private static final Logger LOG = Logger.getLogger(SQLLogSendService.class.getName());
	
	@Value("${mybatis.sql.log.topic:sql-log-topic}")
	private String sqlLogTopic;

	@Value("${mybatis.sql.log.send.url:NONE}")
	private String sqlLogUrl;

	@Autowired
	private RestTemplate restTemplate;

	@Async(AsyncConfiguration.SEND_SQL_LOG_EXECUTOR)
	public void sendSqlLog(SQLLogData logData) {
		Gson gson = new Gson();
		if ("NONE".equals(sqlLogUrl)) {
			logData.setSchema(null);
			LOG.info(gson.toJson(logData));
			return;
		}
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		map.add("topic", sqlLogTopic);
		map.add("data", gson.toJson(logData));
		HttpEntity<MultiValueMap<String, String>> request1 = new HttpEntity<>(map, headers);
		restTemplate.postForEntity(sqlLogUrl, request1, String.class);
	}
}
