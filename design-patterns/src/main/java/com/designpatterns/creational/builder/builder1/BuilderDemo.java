package com.designpatterns.creational.builder.builder1;

public class BuilderDemo {
    public static void main(String[] args) {
        EmployeeWithBuilder builder = new EmployeeWithBuilder
                .EmployeeBuilder("Pelin","Altürk",21,1)
                .setMail("pelinalturk7@gmail.com")
                .build();
        System.out.println(builder);

        /*
        * output:
        * EmployeeWithBuilder{firstName='Pelin', lastName='Altürk', age=21, personalId=1,
        *  phone='null', address='null', mail='pelinalturk7@gmail.com'}*/
    }
}
