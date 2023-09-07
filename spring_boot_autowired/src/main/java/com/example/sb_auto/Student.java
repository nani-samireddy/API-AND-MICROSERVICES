package com.example.sb_auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
    @Autowired
    public Marks marks;
    public  void display(){
        System.out.println("Inside Student class");
    }
}
