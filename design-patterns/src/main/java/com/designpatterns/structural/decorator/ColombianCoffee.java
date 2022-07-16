package com.designpatterns.structural.decorator;

import java.util.Arrays;

public class ColombianCoffee extends PremiumCoffee{

    public ColombianCoffee(){
        this.base = new Latte();
        this.extras = Arrays.asList(() -> 1.25, () -> 0.75);
        this.sides = Arrays.asList(() -> 2.25, () -> 0.25, () -> 1.50);

    }
    @Override
    String getName() {
        return "Colombian";
    }
}
