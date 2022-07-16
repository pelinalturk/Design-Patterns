package com.designpatterns.behavioral.state;

public class OrderState implements PackageState{

    @Override
    public void next(Package pkg) {
         pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg) {
        System.out.println("The package is in its root state");
    }

    @Override
    public void printStatus() {
        System.out.println("Package ordered, not delivered to the office");
    }
}
