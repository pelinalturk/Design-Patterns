package com.designpatterns.behavioral.command;

public class CommandDemo {
    public static void main(String[] args) {
        Order buy1 = new BuyOrder("ABC", 10);
        Order buy2 = new BuyOrder("ABC", 20);
        Order sell1 = new SellOrder("ABC", 10);
        Order sell2 = new SellOrder("ABC", 10);

        Broker broker = new Broker();
        broker.takeOrder(buy1);
        broker.takeOrder(buy2);
        broker.takeOrder(sell1);
        broker.takeOrder(sell2);
        broker.placeOrders();

    }
}
