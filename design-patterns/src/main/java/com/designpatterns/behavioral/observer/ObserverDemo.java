package com.designpatterns.behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Channel channel1 = new NewsChannel();
        Channel channel2 = new NewsChannel();
        Channel channel3 = new NewsChannel();

        NewsAgency agency = new NewsAgency();
        agency.addObserver(channel1);
        agency.addObserver(channel2);
        agency.addObserver(channel3);

        agency.setNews("news 1");
        agency.setNews("news 2");
        agency.setNews("news 3");

        channel1.printNews();
        channel2.printNews();
        channel3.printNews();
    }
}
