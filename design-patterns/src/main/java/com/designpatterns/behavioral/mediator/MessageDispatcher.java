package com.designpatterns.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class MessageDispatcher implements Dispatcher{

    Map<String, Actor>registeredActors = new HashMap<>();

    void register(String topic, Actor actor){
        registeredActors.put(topic, actor);
    }

    @Override
    public void dispatch(String topic, String message) {
        Actor actor = registeredActors.get(topic);
        if(actor == null){
            System.out.println("No actor registered for this topic");
        }else{
            actor.receiveMessage(message);
        }
    }
}
