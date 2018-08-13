package com.gossip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.gossip.query.mapper")
public class QueryStarter {

	public static void main(String[] args) {
		SpringApplication.run(QueryStarter.class, args);
	}
}
