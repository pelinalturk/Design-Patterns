package com.designpatterns.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        EagerInitializationSingleton eagerInitializationSingleton1 =   EagerInitializationSingleton.getInstance();
        System.out.println(eagerInitializationSingleton1.getInfo()); //Initial value
        eagerInitializationSingleton1.setInfo("Changed Value");

        EagerInitializationSingleton eagerInitializationSingleton2 =   EagerInitializationSingleton.getInstance();
        System.out.println(eagerInitializationSingleton2.getInfo()); //Changed Value

        StaticBlockSingleton.getInstance();
        LazySingleton.getInstance();
        ThreadSafeSingleton.getInstance();
        BillPughSingleton.getInstance();

    }
}
