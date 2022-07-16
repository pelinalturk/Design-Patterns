package com.designpatterns.creational.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton(){}

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exceptions can be handled here. " + e );
        }
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}
