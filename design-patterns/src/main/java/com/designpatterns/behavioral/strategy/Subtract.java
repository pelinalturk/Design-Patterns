package com.designpatterns.behavioral.strategy;

public class Subtract implements MathOperation{

    @Override
    public int apply(int a, int b) {
        return a - b;
    }
}
