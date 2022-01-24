package com.raj.config.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class RajConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RajConfigServiceApplication.class, args);
	}

}
