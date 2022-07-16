package com.designpatterns.behavioral.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        StringCollection stringCollection = new StringCollection();
        stringCollection.addString("Str 1");
        stringCollection.addString("Str 2");
        stringCollection.addString("Str 3");
        stringCollection.addString("Str 4");
        stringCollection.addString("Str 5");

        Iterator iterator = stringCollection.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
