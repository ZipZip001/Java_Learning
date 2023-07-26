package com.example.Learn1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	Hello hello = new Hello();

	// Gọi phương thức sayHello()
	String result = hello.sayHello();



}
