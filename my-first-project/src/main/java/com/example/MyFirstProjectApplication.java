package com.example;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class MyFirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectApplication.class, args);
		System.out.println("@@@ App Started");
	}
    
	@RequestMapping("/")
	public String printStartUpMessage() {
		return "Welcome Optimisers";
	}
}
