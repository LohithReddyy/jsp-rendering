package com.klu.nestify.nestify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NestifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(NestifyApplication.class, args);
		System.out.println("hi");
	}

}