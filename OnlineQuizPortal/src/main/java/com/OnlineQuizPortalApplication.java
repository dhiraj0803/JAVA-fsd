package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages="com")
@EntityScan(basePackages="com.bean")
public class OnlineQuizPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineQuizPortalApplication.class, args);
		System.out.println("Server up...");
		System.out.println("*****This Project is Developed by Yadav Dhiraj Rajendra Prasad******");
		System.out.println("*******ONLINE QUIZ PORTAL APPLICATION*******");
	}

}
