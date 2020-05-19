package com.madjava.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import com.spring4all.swagger.EnableSwagger2Doc;

import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.madjava.micro.baseservice.mapper")
@SpringBootApplication
@EnableSwagger2Doc
@EnableInternationalization
@EnableAsync
public class BaseServiceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(BaseServiceApp.class, args);
	}

}
