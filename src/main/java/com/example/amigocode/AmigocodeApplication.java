package com.example.amigocode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

//This annotation makes the class serve REST end points
@RestController

public class AmigocodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigocodeApplication.class, args);
	}

	//This annotation allows for it to serve a RESTFUL end point.
	@GetMapping
	public String hello() {
		return "Hello World";
	}


}
