package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "🚀 Spring Boot App on Render using Docker!";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
