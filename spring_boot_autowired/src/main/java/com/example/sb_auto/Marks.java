package com.example.sb_auto;

import org.springframework.stereotype.Component;

@Component
public class Marks {
    public void display(){
        System.out.println("inside the Marks class");
        System.out.println("Dynamically injected using autowired");

    }
}
