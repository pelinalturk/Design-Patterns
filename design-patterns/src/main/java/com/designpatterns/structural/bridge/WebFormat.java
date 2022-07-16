package com.designpatterns.structural.bridge;

public class WebFormat implements ReportFormat{

    @Override
    public void generate() {
        System.out.println("Report generated in web format");
    }
}
