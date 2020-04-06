package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello there");
		System.out.println();
		System.out.println("This program is running " + DemoApplication.class.getPackage().getImplementationVersion());
		SpringApplication.run(DemoApplication.class, args);
	}

}
