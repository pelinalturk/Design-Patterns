package com.designpatterns.structural.decorator;

import java.util.List;

abstract class ExtraCoffee extends Coffee{
    Coffee base;
    List<Priceable>extras;

    @Override
    public Double getPrice() {
        return base.getPrice() + extras.stream().map(Priceable::getPrice).reduce(0.0, Double::sum);
    }
}
