package com.designpatterns.creational.prototype;

public class Prototype implements Cloneable{
    private String field1;
    private String field2;

    public Prototype(String field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    @Override
    protected Prototype clone()  {
        //return new Prototype(field1, field2); -> Deep copy
        Prototype copy = this; // ->  Shallow Copy
        return copy;
    }
}
