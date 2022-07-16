package com.designpatterns.creational.factory;


public class FactoryDemo {
    public static void main(String[] args) {
        String file = FileExporterFactory.getInstance(FileExporterFactory.FileType.EXCEL).export(" Test");
        System.out.println(file);
    }
}
