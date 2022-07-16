package com.designpatterns.behavioral.templateMethod;

public class Football extends Game{

    @Override
    void initialize() {
        System.out.println("Football game Initialized! Start playing");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
