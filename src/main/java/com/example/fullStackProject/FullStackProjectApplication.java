package com.example.fullStackProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:5173")
@SpringBootApplication
public class FullStackProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullStackProjectApplication.class, args);
	}

}