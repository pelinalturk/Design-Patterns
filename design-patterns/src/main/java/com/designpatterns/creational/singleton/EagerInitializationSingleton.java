package com.designpatterns.creational.singleton;

public class EagerInitializationSingleton {

    private static EagerInitializationSingleton INSTANCE  = new EagerInitializationSingleton();
    private String info = "Initial value";

    private EagerInitializationSingleton(){}

    public static EagerInitializationSingleton getInstance(){
        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info ;
    }
}
