package com.designpatterns.structural.composite;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FinanceDepartment extends Department{

    @Override
    String getName() {
        return "Finance";
    }

    @Override
    List<String> getEmployees() {
        return Arrays.asList("E1", "E2", "E3");
    }

    @Override
    Map<String, String> getReports() {
        return null;
    }
}
