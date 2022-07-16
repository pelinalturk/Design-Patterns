package com.designpatterns.behavioral.mediator;

public class MessageActor implements Actor{
    String name;
    Dispatcher dispatcher;

    public MessageActor(String name, Dispatcher dispatcher) {
        this.name = name;
        this.dispatcher = dispatcher;
    }


    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }

    @Override
    public void sendMessage(String topic, String message) {
        dispatcher.dispatch(topic, message);
    }
}
