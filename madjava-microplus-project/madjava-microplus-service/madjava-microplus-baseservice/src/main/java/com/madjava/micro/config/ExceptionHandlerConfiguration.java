package com.madjava.micro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.madjava.micro.handler.GlobalExceptionHandler;

@Configuration
public class ExceptionHandlerConfiguration {

	@Bean
    GlobalExceptionHandler getGlobalExceptionHandler() {
        return new GlobalExceptionHandler();
    }
}
