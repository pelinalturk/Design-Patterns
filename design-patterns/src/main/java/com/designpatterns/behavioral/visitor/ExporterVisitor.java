package com.designpatterns.behavioral.visitor;

public interface ExporterVisitor {
    void exporterGraph(Graph graph);
    void exporterCity(City city);
    void exporterIndustrialZone(IndustrialZone industrialZone);
    void exporterStadium(Stadium stadium);
}
