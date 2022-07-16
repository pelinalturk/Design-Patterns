package com.designpatterns.structural.composite;

import java.util.Arrays;

public class CompositeDemo {
    public static void main(String[] args) {
        Department financeDepartment  = new FinanceDepartment();
        Department salesDepartment = new SalesDepartment();
        Department regionalDirectorate = new RegionalDirectorate(Arrays.asList(financeDepartment, salesDepartment));

        System.out.println(regionalDirectorate.getName());
        System.out.println(regionalDirectorate.getEmployees());
        System.out.println(regionalDirectorate.getReports());
    }
}
