package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class DsSpringCloudM4SecurecliApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsSpringCloudM4SecurecliApplication.class, args);
	}
}
