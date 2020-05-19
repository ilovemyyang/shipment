package com.madjava.micro.config;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import okhttp3.OkHttpClient;

@Configuration
public class WebConfiguration {

    /**
	 * 基于OkHttp3配置RestTemplate
	 * 
	 * @return
	 */
	@Bean
	@ConditionalOnMissingBean
	public RestTemplate restTemplate() {
		OkHttpClient client = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS)
				.readTimeout(20, TimeUnit.SECONDS).build();
		return new RestTemplate(new OkHttp3ClientHttpRequestFactory(client));
	}

}
