package com.designpatterns.structural.composite;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesDepartment extends Department{

    @Override
    String getName() {
        return "Sales";
    }

    @Override
    List<String> getEmployees() {
        return Arrays.asList("E4","E5","E6");
    }

    @Override
    Map<String, String> getReports() {
       return null;
    }
}
