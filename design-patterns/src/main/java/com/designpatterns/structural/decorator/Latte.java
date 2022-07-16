package com.designpatterns.structural.decorator;

import java.util.Arrays;

public class Latte extends ExtraCoffee{

    public Latte(){
        this.base = new Espresso();
        this.extras = Arrays.asList(() -> 1.25, () -> 0.75);
    }

    @Override
    String getName() {
        return "Latte";
    }
}
