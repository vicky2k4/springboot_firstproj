package com.learn.firstproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) //for testing without database url
public class SpringbootFirstprojApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstprojApplication.class, args);
		
		System.out.println("test spring boot app");
	}

}
