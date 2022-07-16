package com.designpatterns.behavioral.visitor;


import java.util.List;

public class XmlExporter implements ExporterVisitor{

    @Override
    public void exporterGraph(Graph graph) {
        List<Node> nodes = graph.getNodes();
        for(Node node : nodes){
            if(node instanceof City){
                exporterCity((City) node);
            } else if (node instanceof IndustrialZone) {
                exporterIndustrialZone((IndustrialZone) node);
            } else if (node instanceof Stadium) {
                exporterStadium((Stadium) node);
            }else {
                System.out.println("Unknown node type");
            }
        }
    }

    @Override
    public void exporterCity(City city) {
        System.out.println("Exporting city in xml format");
        city.display();
    }

    @Override
    public void exporterIndustrialZone(IndustrialZone industrialZone) {
        System.out.println("Exporting industrial zone in xml format");
        industrialZone.display();
    }

    @Override
    public void exporterStadium(Stadium stadium) {
        System.out.println("Exporting stadium in xml format");
        stadium.display();
    }
}
