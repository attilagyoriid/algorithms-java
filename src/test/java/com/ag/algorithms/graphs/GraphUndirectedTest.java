package com.ag.algorithms.graphs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class GraphUndirectedTest {
    static GraphUndirected graphUndirected;

    @BeforeAll
    static void setUp() {
        graphUndirected = new GraphUndirected();
        graphUndirected.addNode(1);
        graphUndirected.addNode(2);
        graphUndirected.addNode(3);
        graphUndirected.addNode(4);
        graphUndirected.addNode(5);
        graphUndirected.addNode(6);

        graphUndirected.addEdge(1,5);
        graphUndirected.addEdge(1,2);
        graphUndirected.addEdge(2,5);
        graphUndirected.addEdge(2,1);
        graphUndirected.addEdge(2,5);
        graphUndirected.addEdge(2,3);
        graphUndirected.addEdge(5,2);
        graphUndirected.addEdge(5,1);
        graphUndirected.addEdge(5,4);
        graphUndirected.addEdge(3,2);
        graphUndirected.addEdge(3,4);
        graphUndirected.addEdge(4,3);
        graphUndirected.addEdge(4,5);
        graphUndirected.addEdge(4,6);
        graphUndirected.addEdge(4,6);
        graphUndirected.addEdge(6,4);
    }

    @Test
    void addNode() {
        GraphUndirected graphUndirected = new GraphUndirected();
        graphUndirected.addNode(5);
        graphUndirected.addNode(6);

        graphUndirected.addEdge(5,6);
        Assertions.assertThat(graphUndirected.getNumberOfNodes()).isEqualTo(2);
    }

    @Test
    void addEdge() {
    }

    @Test
    void testPrintGraph() {
    }

    @Test
    void getNumberOfNodes() {
    }

    @Test
    void getAdjacencyList() {
        Map<Integer, List<Integer>> expectedGraph = Map.of(1, List.of(5, 2), 2, List.of(1, 5, 3), 3, List.of(2, 4), 4, List.of(5, 3, 6), 5, List.of(1, 2, 4), 6, List.of(4));
        Assertions.assertThat(graphUndirected.getAdjacencyList()).isEqualTo(expectedGraph);
    }


}