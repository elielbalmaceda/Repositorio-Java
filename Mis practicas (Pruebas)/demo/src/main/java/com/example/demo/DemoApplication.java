package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	public class Main {
		void myMethod() {
		  System.out.println("hola!");
		}
	  
		public void main(String[] args) {
		  myMethod();
		}
	}
}

