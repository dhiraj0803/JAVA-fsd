package com.aws.springAWSdeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAwsDeploymentApplication {
	
	
	@GetMapping("/")
	public String home() {
		return "Welcome to first deployment spring boot application on AWS cloud....!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAwsDeploymentApplication.class, args);
		
		System.out.println("Started");
	}

}
