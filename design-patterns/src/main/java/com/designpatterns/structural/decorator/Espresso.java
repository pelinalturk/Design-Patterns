package com.designpatterns.structural.decorator;

public class Espresso extends Coffee{

    @Override
    String getName() {
        return "Espresso";
    }

    @Override
    public Double getPrice() {
        return 10.0;
    }
}
