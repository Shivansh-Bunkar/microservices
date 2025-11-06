package com.sathya.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AdminServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(AdminServer1Application.class, args);
	}

}
