package com.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Graph implements Node{

    List<Node> nodes = new ArrayList<>();

    public List<Node> getNodes() {
        return nodes;
    }

    void addNode(Node node){
        nodes.add(node);
    }

    @Override
    public void display() {
        for(Node node : nodes) {
            node.display();
        }
    }
}
