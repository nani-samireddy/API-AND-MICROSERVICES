package com.example.spring_boot_logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {
    @GetMapping("/msg")
    public String msg()
    {
        return("Spring Boot Demo");
    }
}