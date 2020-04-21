package com.ajith.ust.springboot.managementapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.ajith.ust.springboot.managementapi.repositories")
public class ManagementapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagementapiApplication.class, args);
	}

}
