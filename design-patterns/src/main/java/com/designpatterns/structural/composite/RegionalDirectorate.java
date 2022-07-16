package com.designpatterns.structural.composite;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RegionalDirectorate extends Department{

    List<Department>childDepartments;
    public RegionalDirectorate(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    @Override
    String getName() {
        return childDepartments.stream().map(Department::getName).collect(Collectors.joining(", "));
    }

    @Override
    List<String> getEmployees() {
        return childDepartments.stream().flatMap(d -> d.getEmployees().stream()).collect(Collectors.toList());
    }

    @Override
    Map<String, String> getReports() {
        return childDepartments.stream().flatMap(d -> d.getReports().entrySet().stream()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
