package com.oversee.overseeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class OverseeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OverseeApiApplication.class, args);
	}
}
