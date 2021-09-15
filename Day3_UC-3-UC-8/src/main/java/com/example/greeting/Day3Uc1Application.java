package com.example.greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Day3Uc1Application {

	public static void main(String[] args) {
		SpringApplication.run(Day3Uc1Application.class, args);
	}

}
