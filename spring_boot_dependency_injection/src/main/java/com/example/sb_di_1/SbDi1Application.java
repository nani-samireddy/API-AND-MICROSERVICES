package com.example.sb_di_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SbDi1Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SbDi1Application.class, args);
        Employee employee = context.getBean(Employee.class);
        employee.print();
    }

}
