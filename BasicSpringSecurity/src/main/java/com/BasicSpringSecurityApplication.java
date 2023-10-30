package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication

@EnableWebSecurity			//annotation for activating spring security
public class BasicSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicSpringSecurityApplication.class, args);
		System.out.println("Server up...");
	}

}
