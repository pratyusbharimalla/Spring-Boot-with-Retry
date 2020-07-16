package com.regency.spring.retry.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class SpringRetryServicePatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRetryServicePatternApplication.class, args);
		System.out.println("\n*********************************************************"
				+ "\nSpring Framework with Retry integration started..."
				+ "\n*********************************************************\n");
	}

}
