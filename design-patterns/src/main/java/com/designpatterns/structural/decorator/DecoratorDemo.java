package com.designpatterns.structural.decorator;

public class DecoratorDemo {
    Coffee latte = new Latte();
    Coffee colombian = new ColombianCoffee();

    public void getOrder(){
        System.out.println("Name: " + latte.getName()+"\nPrice: "+ latte.getPrice()); //Latte 12.0
    }
}
