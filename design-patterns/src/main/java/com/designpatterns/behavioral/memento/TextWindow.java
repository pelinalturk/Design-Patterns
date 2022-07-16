package com.designpatterns.behavioral.memento;

public class TextWindow {
    StringBuilder currentText;

    public TextWindow() {
        this.currentText = new StringBuilder();
    }

    void addText(String text){
        currentText.append(text);
    }

    String getText(){
        return currentText.toString();
    }

    public TextWindowState save(){
        return new TextWindowState(currentText.toString());
    }

    public void restore(TextWindowState save){
        currentText = new StringBuilder(save.getText());
    }
}
