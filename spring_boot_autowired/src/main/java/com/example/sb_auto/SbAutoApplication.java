package com.example.sb_auto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SbAutoApplication {

    public static void main(String[] args) {
        ApplicationContext  context= SpringApplication.run(SbAutoApplication.class, args);
        Student student = (Student) context.getBean("student");
        student.display();
        student.marks.display();
    }   
}
