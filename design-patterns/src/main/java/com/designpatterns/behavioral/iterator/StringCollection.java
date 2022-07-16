package com.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class StringCollection implements Container{
    private List<String>strings = new ArrayList<>();

    void addString(String string){
        strings.add(string);
    }

    @Override
    public Iterator getIterator() {
        return new StringCollectionIterator(strings);
    }
}
