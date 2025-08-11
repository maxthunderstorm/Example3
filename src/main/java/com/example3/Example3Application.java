package com.example3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Example3Application {

	public static void main(String[] args) {
		 SpringApplication.run(Example1Application.class, args);

        String message = "Spring Boot is Awesome!";
        System.out.println("Original: " + message);
        System.out.println("Uppercase: " + message.toUpperCase(Locale.ROOT));
        System.out.println("Lowercase: " + message.toLowerCase(Locale.ROOT));
        System.out.println("Length: " + message.length());

        System.out.println("Current Time: " + LocalDateTime.now());
    }

}
