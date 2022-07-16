package com.designpatterns.behavioral.memento;

public class MementoDemo {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("The Memento Design Pattern\n");
        textEditor.write("How to implement it in Java?\n");
        textEditor.hitSave();

        textEditor.write("Buy milk and eggs before coming home\n");

        textEditor.print();

        textEditor.hitUndo();
        textEditor.print();
    }
}
/*
output:
The Memento Design Pattern
How to implement it in Java?
Buy milk and eggs before coming home

The Memento Design Pattern
How to implement it in Java?
*/
