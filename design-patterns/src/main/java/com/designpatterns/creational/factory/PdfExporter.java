package com.designpatterns.creational.factory;

class PdfExporter implements FileExporter{

    @Override
    public String export(String content) {
        return "PDF: " + content;
    }
}
