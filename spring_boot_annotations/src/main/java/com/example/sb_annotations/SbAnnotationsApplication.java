package com.example.sb_annotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SbAnnotationsApplication {
    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(SbAnnotationsApplication.class, args);
        CustomerServiceImpl service = (CustomerServiceImpl) context.getBean("customerService");
        System.out.println(service.fetchCustomer());

    }
}
