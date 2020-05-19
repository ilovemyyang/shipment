package com.madjava.micro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;

import com.spring4all.swagger.EnableSwagger2Doc;

@MapperScan("com.madjava.micro.mapper")
@SpringBootApplication
//@EnableDiscoveryClient
@EnableSwagger2Doc
@EnableInternationalization
@EnableAsync
public class ShipmentApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ShipmentApp.class, args);
    }
}
