package com.designpatterns.structural.bridge;

public class DesktopFormat implements ReportFormat{

    @Override
    public void generate() {
        System.out.println("Report generated in desktop format");
    }
}
