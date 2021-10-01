package com.ag.algorithms.graphs;

import java.util.*;

public class GraphUndirected {
    private int numberOfNodes;
    private final Map<Integer, ArrayList<Integer>> adjacencyList = new HashMap<>();

    public void addNode(Integer node) {

        this.adjacencyList.put(node, new ArrayList<>());
        numberOfNodes++;

    }
    public void addEdge(Integer node1, Integer node2) {

        Optional.ofNullable(this.adjacencyList.get(node1)).orElseThrow(() -> new NoSuchElementException("Node: " + node1 + " not found!"));

        if (!this.adjacencyList.get(node1).contains(node2)) {
            this.adjacencyList.get(node1).add(node2);
        }
        this.adjacencyList.putIfAbsent(node2, new ArrayList<>());
        if (!this.adjacencyList.get(node2).contains(node1)) {
            this.adjacencyList.get(node2).add(node1);
        }
    }

    public void printGraph () {

        adjacencyList.forEach((k,v) -> {
            System.out.print("Node: " + k + "-->");
            v.forEach(i-> System.out.print(" " + i));
            System.out.println();
        });

    }

    public int getNumberOfNodes() {
        return numberOfNodes;
    }

    public Map<Integer, ArrayList<Integer>> getAdjacencyList() {
        return adjacencyList;
    }


}
