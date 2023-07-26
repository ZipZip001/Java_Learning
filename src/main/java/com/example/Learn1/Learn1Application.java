package com.example.Learn1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Learn1Application {

	public static void main(String[] args) {
		SpringApplication.run(Learn1Application.class, args);
	}
	Hello hello = new Hello();

	// Gọi phương thức sayHello()
	String result = hello.sayHello();



}
