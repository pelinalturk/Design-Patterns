package com.designpatterns.creational.factory;

class ExcelExporter implements FileExporter{

    @Override
    public String export(String content) {
        return "Excel: " + content;
    }
}
