package track13Graph.pack1Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class Graph {

    private final int vertexesCapacity = 20;
    private final Vertex[] vertexes;
    private int vertexesSize;
    private LinkedList[] listArray = new LinkedList[20];
    private final int[][] edgeMatrix;
    private final Stack<Integer> stackShow = new Stack<>();
    private final Queue<Integer> queueShow = new LinkedBlockingQueue<>();

    public Graph() {
        vertexes = new Vertex[vertexesCapacity];
        edgeMatrix = new int[vertexesCapacity][vertexesCapacity];
    }

    public void addVertex(char c) {
        vertexes[vertexesSize++] = new Vertex(c);
    }

    public void addEdge(int from, int to) {
        edgeMatrix[from][to] = 1;
//        edgeMatrix[to][from] = 1;
    }

    public void showVertex(int position) {
        System.out.println(vertexes[position].getLabel());
    }

    public void showGraphDFSRecursion(int position) {
        graphDFSRecursion(position);
        cleanAllVisits();
    }

    private void graphDFSRecursion(int position) {
        System.out.print(vertexes[position].getLabel() + " ");
        vertexes[position].setWasVisited(true);
        for (int i = 0; i < vertexesSize; i++) {
            if (edgeMatrix[position][i] == 1 && !vertexes[i].isWasVisited()) {
                graphDFSRecursion(i);
            }
        }
    }

    public void showGraphDFS(int position) {
        stackShow.add(position);
        System.out.print(vertexes[stackShow.peek()].getLabel() + " ");
        vertexes[stackShow.peek()].setWasVisited(true);
        while (!stackShow.isEmpty()) {
            int i;
            for (i = 0; i < vertexesSize; i++) {
                if (edgeMatrix[stackShow.peek()][i] == 1 && !vertexes[i].isWasVisited()) {
                    stackShow.add(i);
                    break;
                }
            }
            if (i == vertexesSize) {
                stackShow.pop();
            } else {
                System.out.print(vertexes[stackShow.peek()].getLabel() + " ");
                vertexes[stackShow.peek()].setWasVisited(true);
            }
        }

        cleanAllVisits();
    }

    public void showGraphBFS(int position, boolean doMST) {
        queueShow.add(position);
        while (!queueShow.isEmpty()) {
            System.out.print(vertexes[queueShow.peek()].getLabel() + " ");
            vertexes[queueShow.peek()].setWasVisited(true);
            int i;
            for (i = 0; i < vertexesSize; i++) {
                if (edgeMatrix[queueShow.peek()][i] == 1) {
                    if (!vertexes[i].isWasVisited()) {
                        queueShow.add(i);
                        vertexes[i].setWasVisited(true);
                    } else {
                        if (doMST)
                            edgeMatrix[queueShow.peek()][i] = 0;
                    }
                }
            }
            queueShow.remove();
        }

        cleanAllVisits();
    }

    public int countEdge() {
        int counter = 0;
        for (int i = 0; i < vertexesSize; i++) {
            for (int j = 0; j < vertexesSize; j++) {
                if (edgeMatrix[i][j] == 1) {
                    counter++;
                }
            }
        }
        return counter /* / 2 */;
    }

    public void showTopo() {
        System.out.print("topo: ");
        boolean hasLast = true;
        while (hasLast) {
            hasLast = false;
            for (int i = 0; i < vertexesSize; i++) {
                boolean isLast = true;
                for (int j = 0; j < vertexesSize; j++) {
                    if (edgeMatrix[i][j] == 1 && !vertexes[j].isWasVisited()) {
                        isLast = false;
                        break;
                    }
                }
                if (isLast && !vertexes[i].isWasVisited()) {
                    vertexes[i].setWasVisited(true);
                    stackShow.add(i);
                    hasLast = true;
                }
            }
        }

        while (!stackShow.isEmpty()) {
            System.out.print(vertexes[stackShow.pop()].getLabel() + " ");
        }

        if(!cleanAllVisits()) {
            System.out.println("ERROR: Graph has cycles");
        }
        System.out.println();
    }

    private boolean cleanAllVisits() {
        int visitsCounter = 0;
        for (Vertex v : vertexes) {
            if (v != null) {
                v.setWasVisited(false);
                visitsCounter++;
            }
        }
        return visitsCounter == vertexesSize;
    }
}
