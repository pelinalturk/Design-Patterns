package com.designpatterns.behavioral.visitor;

public class City implements Node{

    @Override
    public void display() {
        System.out.println("This is a city");
    }
}
