package com.designpatterns.behavioral.memento;

public class TextWindowState {
    String text;

    public TextWindowState(String text){
        this.text = text;
    }

    String getText(){
        return text;
    }
}
