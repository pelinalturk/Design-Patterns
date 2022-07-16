package com.designpatterns.behavioral.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        MessageDispatcher dispatcher = new MessageDispatcher();

        Actor actor1 = new MessageActor("Actor1", dispatcher);
        Actor actor2 = new MessageActor("Actor2", dispatcher);
        Actor actor3 = new MessageActor("Actor3", dispatcher);
        Actor actor4 = new MessageActor("Actor4", dispatcher);

        dispatcher.register("topic1", actor1);
        dispatcher.register("topic2", actor2);
        dispatcher.register("topic3", actor3);
        dispatcher.register("topic4", actor4);

        actor1.sendMessage("topic2", "Message for topic 2");
        actor1.sendMessage("topic3", "Message for topic 3");
        actor1.sendMessage("topic4", "Message for topic 4");

        actor2.sendMessage("topic1", "Message for topic 1");
        actor2.sendMessage("topic5", "Message for topic 5");

        /*
        output:
        Actor2 received message: Message for topic 2
        Actor3 received message: Message for topic 3
        Actor4 received message: Message for topic 4
        Actor1 received message: Message for topic 1
        No actor registered for this topic
        */
    }
}
