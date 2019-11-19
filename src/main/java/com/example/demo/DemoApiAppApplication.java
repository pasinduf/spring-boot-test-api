package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.demo.entities"})
public class DemoApiAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApiAppApplication.class, args);
	}

}
