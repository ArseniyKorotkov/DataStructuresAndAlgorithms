package track14WeightedGraph.pack3Projects.p3;

import java.util.ArrayList;

public class Graph {

    private static final int CAPACITY = 20;
    private final ArrayList<Vertex> vertices = new ArrayList<>();
    private int[][] edges;

    public Graph() {
        this.edges = new int[CAPACITY][CAPACITY];
    }

    public void addVertex(char c) {
        if (vertices.size() < CAPACITY) vertices.add(new Vertex(c));
    }

    public void addEdge(int from, int to, int weight) {
        edges[from][to] = weight;
    }

    public void doFloydAlgorithm() {
        int size = vertices.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    if (edges[j][i] > 0 && edges[i][k] > 0
                        && (edges[j][k] == 0 || edges[j][i] + edges[i][k] < edges[j][k])) {
                        edges[j][k] = edges[j][i] + edges[i][k];
                    }
                }
            }
        }
    }

    public void showEdges() {
        for (int i = 0; i < vertices.size(); i++) {
            for (int j = 0; j < vertices.size(); j++) {
                System.out.print(edges[i][j] + " ");
                if (String.valueOf(edges[i][j]).length() < 2) {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();
    }


}
