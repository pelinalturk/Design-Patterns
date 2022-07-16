package com.designpatterns.behavioral.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        Node city  = new City();
        Node industrialZone = new IndustrialZone();
        Node stadium = new Stadium();

        Graph graph = new Graph();
        graph.addNode(city);
        graph.addNode(industrialZone);
        graph.addNode(stadium);

        ExporterVisitor exporterVisitor = new XmlExporter();
        exporterVisitor.exporterGraph(graph);
    }
}
