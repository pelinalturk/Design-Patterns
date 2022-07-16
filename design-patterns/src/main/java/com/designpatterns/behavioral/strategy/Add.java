package com.designpatterns.behavioral.strategy;

public class Add implements MathOperation {

    @Override
    public int apply(int a, int b) {
        return a + b ;
    }
}
