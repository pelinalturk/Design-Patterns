package com.designpatterns.creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Prototype prototype1 = new Prototype("Original Value 1 ",  "Original Value 2 ");
        System.out.println(String.format("Original instance field1: %s field2: %s", prototype1.getField1(),prototype1.getField1()));

        Prototype prototype2 = prototype1.clone();
        prototype2.setField1("Changed Value 1 ");
        prototype2.setField1("Changed Value 2 ");
        System.out.println(String.format("Changed instance field1: %s field2: %s", prototype2.getField1(),prototype2.getField1()));
        System.out.println(String.format("Original instance field1: %s field2: %s", prototype1.getField1(),prototype1.getField1()));

        /*
        * output:
        * Original instance field1: Original Value 1  field2: Original Value 1
        Changed instance field1: Changed Value 2  field2: Changed Value 2
        Original instance field1: Changed Value 2  field2: Changed Value 2
        * */
    }
}
