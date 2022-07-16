package com.designpatterns.structural.composite;

import java.util.List;
import java.util.Map;

abstract class Department {
    abstract String getName();
    abstract List<String> getEmployees();
    abstract Map<String, String> getReports();
}
