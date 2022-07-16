package com.designpatterns.creational.singleton;

public class ThreadSafeSingleton
{
    private static ThreadSafeSingleton INSTANCE;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance() {
        if(INSTANCE == null)
            INSTANCE = new ThreadSafeSingleton();
        return INSTANCE;
    }
}
