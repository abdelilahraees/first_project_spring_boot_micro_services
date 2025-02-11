package com.example.discouvry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class DiscouvryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscouvryApplication.class, args);
	}

}
