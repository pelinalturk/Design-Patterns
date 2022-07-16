package com.designpatterns.structural.decorator;

import java.util.List;

abstract class PremiumCoffee extends ExtraCoffee{
    List<Priceable>sides;

    @Override
    public Double getPrice() {
        return super.getPrice() + sides.stream().map(Priceable::getPrice).reduce(0.0, Double::sum);
    }
}
