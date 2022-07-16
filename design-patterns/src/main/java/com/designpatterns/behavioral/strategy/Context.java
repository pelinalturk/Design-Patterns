package com.designpatterns.behavioral.strategy;

public class Context {
    private MathOperation strategy;

    public Context(MathOperation strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.apply(num1, num2);
    }
}
