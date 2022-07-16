package com.designpatterns.structural.bridge;

public class EmployeePerformanceReport extends Report{

    public EmployeePerformanceReport(ReportFormat reportFormat) {
        super(reportFormat);
    }

    @Override
    public void display() {
        System.out.println("Employee performance report");
        super.display();
    }
}
