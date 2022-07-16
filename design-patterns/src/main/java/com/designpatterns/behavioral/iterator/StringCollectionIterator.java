package com.designpatterns.behavioral.iterator;

import java.util.List;

public class StringCollectionIterator implements Iterator{
    private List<String>strings;
    private int pos = 0;

    public StringCollectionIterator(List<String> strings) {
        this.strings = strings;
    }


    @Override
    public boolean hasNext() {
        if(pos >=strings.size() || strings.get(pos) == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        String string = strings.get(pos);
        pos +=1;
        return string;
    }
}
