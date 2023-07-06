package track13Graph.pack2Projects.p4;

import jdk.swing.interop.SwingInterOpUtils;

public class Graph {

    private static final int EDGES_CAPACITY = 9;
    private final int[][] edgeMatrix = new int[EDGES_CAPACITY][EDGES_CAPACITY];
    private String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};


    public void addEdge(int from, int to) {
        edgeMatrix[from][to] = 1;
    }

    public void transitiveClosure() {

        for (int i = 0; i < EDGES_CAPACITY; i++) {
            for (int j = 0; j < EDGES_CAPACITY; j++) {
                for (int k = 0; k < EDGES_CAPACITY; k++) {
                    if (edgeMatrix[k][i] != 0 && edgeMatrix[i][j] != 0 && edgeMatrix[k][j] == 0) {
                        edgeMatrix[k][j] = 2;
                    }
                }
            }
        }
    }

    public void showEdgeMatrix() {
        for (int i = 0; i < EDGES_CAPACITY; i++) {
            for (int j = 0; j < EDGES_CAPACITY; j++) {
                if (i == j) {
                    System.out.print("-  ");
                } else {
                    System.out.print(edgeMatrix[i][j] + "  ");
                }
            }
            System.out.print(letters[i] + "  ");
            System.out.println();
        }

        for (String s : letters) {
            System.out.print(s + "  ");
        }
        System.out.println();
        System.out.println();
    }


}
