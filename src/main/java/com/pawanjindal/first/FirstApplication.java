package com.pawanjindal.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories //we are going to perform JPA related activity so we have to tell to springboot
public class FirstApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(FirstApplication.class, args);
	}

}
