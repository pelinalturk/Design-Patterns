package com.designpatterns.behavioral.memento;

public class TextEditor {

    TextWindow textWindow;
    TextWindowState savedTextWindow;

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    void write(String text){
        textWindow.addText(text);
    }

    void print(){
        System.out.println(textWindow.getText());
    }

    void hitSave(){
        savedTextWindow = textWindow.save();
    }

    void hitUndo(){
        textWindow.restore(savedTextWindow);
    }
}
