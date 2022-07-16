package com.designpatterns.creational.builder.builder1;

public class Employee{
    private final String firstName; //required
     private final String lastName; //required
    private final int age; //required
    private final int personalId; //required
    private final String phone; //optional
    private final String address; //optional
    private final String mail; //optional

    public Employee(String firstName, String lastName, int age, int personalId, String phone, String address, String mail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.personalId = personalId;
        this.phone = phone;
        this.address = address;
        this.mail = mail;
    }
}


