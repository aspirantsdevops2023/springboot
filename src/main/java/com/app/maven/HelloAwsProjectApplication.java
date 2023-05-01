package com.app.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloAwsProjectApplication {
	
	
	@GetMapping("/sampleapi")
	public String Hello() {
		return "hello aws";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloAwsProjectApplication.class, args);
	}

}
