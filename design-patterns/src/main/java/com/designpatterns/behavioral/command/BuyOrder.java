package com.designpatterns.behavioral.command;

public class BuyOrder implements Order{
    String stock;
    int amount;

    public BuyOrder(String stock, int amount) {
        this.stock = stock;
        this.amount = amount;
    }

    @Override
    public void apply() {
        System.out.println("Buying " + amount + " " + stock + " stock");
    }
}
