package com.designpatterns.structural.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Report salesReport = new SalesReport(new WebFormat());
        salesReport.display();

        System.out.println("-------");

        Report employeePerformanceReport = new EmployeePerformanceReport(new DesktopFormat());
        employeePerformanceReport.display();

        /*
        output:
        Sales report
        Report generated in web format
        -------
        Employee performance report
        Report generated in desktop format
        */
    }
}
