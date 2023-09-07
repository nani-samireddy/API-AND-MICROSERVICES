package org.example;

public class Student {
    private final String name;
    private final String rollNumber;
    Student(String name, String rollNumber){
        this.name=name;
        this.rollNumber = rollNumber;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+rollNumber);
    }
}
