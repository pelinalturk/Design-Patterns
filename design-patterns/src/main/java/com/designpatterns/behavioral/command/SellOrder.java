package com.designpatterns.behavioral.command;

public class SellOrder implements Order{
    String stock;
    int amount;

    public SellOrder(String stock, int amount) {
        this.stock = stock;
        this.amount = amount;
    }

    @Override
    public void apply() {
        System.out.println("Selling " + amount + " " + stock + " stock");
    }
}
