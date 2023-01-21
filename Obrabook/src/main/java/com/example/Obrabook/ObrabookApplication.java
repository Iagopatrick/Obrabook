package com.example.Obrabook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ObrabookApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObrabookApplication.class, args);
	}

}
