package com.example.DersApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DersApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DersApiApplication.class, args);
	}
}
