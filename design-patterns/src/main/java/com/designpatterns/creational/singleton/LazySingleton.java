package com.designpatterns.creational.singleton;

public class LazySingleton {

    private static LazySingleton INSTANCE;

    private LazySingleton(){}

    public static LazySingleton getInstance() {
        if(INSTANCE == null)
            INSTANCE = new LazySingleton();
        return INSTANCE;
    }
}
