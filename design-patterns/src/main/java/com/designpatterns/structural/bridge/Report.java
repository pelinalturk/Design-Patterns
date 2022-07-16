package com.designpatterns.structural.bridge;

public class Report {
    private ReportFormat reportFormat;

    public Report(ReportFormat reportFormat) {
        this.reportFormat = reportFormat;
    }

    public void display(){
        reportFormat.generate();
    }
}
