package org.example;

import org.springframework.stereotype.Component;

@Component
public class Employee {
   private  String name;
   private String ph;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

}
