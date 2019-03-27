package com.example.configclienttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientTestApplication.class, args);
	}

}
