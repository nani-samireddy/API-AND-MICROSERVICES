package com.example.spring_boot_scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {
    @Value("10")
    private int count;
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public String fetchCustomer() {
        return " The number of customers fetched are : " + count;
    }
}
