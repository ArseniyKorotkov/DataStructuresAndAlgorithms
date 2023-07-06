package track14WeightedGraph.pack3Projects.p2;


import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class Graph {

    private Vertex[] vertices;
    private final Queue<Vertex> showBFSQueue = new LinkedBlockingQueue<>();
    private final Stack<Vertex> showDFSStack = new Stack<>();
    private int size;
    private int capacity;

    public Graph(int capacity) {
        this.capacity = capacity;
        vertices = new Vertex[capacity];
    }

    public void addVertex(Vertex v) {
        vertices[size++] = v;
    }

    public void addFreeVertex(char c) {
        vertices[size++] = new Vertex(c);
    }

    public void addEdge(int from, int to, int weight) {
        vertices[from].addEdge(to, weight);
    }

    public void showBFS(int start) {
        showBFSQueue.add(vertices[start]);
        vertices[start].setVisited(true);
        System.out.print("BFS from " + showBFSQueue.element().getValue() + ": ");
        while (true) {

            ArrayList<Edge> edges = showBFSQueue.element().getEdges();
            for (Edge edge : edges) {
                Vertex v = vertices[edge.getTo()];
                if (!v.isVisited()) {
                    showBFSQueue.add(vertices[edge.getTo()]);
                }
                v.setVisited(true);
            }
            showBFSQueue.remove();
            if(showBFSQueue.isEmpty()) {
               break;
            }
            System.out.print(showBFSQueue.peek().getValue() + " ");
        }
        cleanVisited();
        System.out.println();

    }

    public void showDFS(int start) {
        boolean isLastInWay;

        showDFSStack.add(vertices[start]);
        vertices[start].setVisited(true);
        System.out.print("DFS from " + vertices[start].getValue() + ": ");

        while (!showDFSStack.isEmpty()) {
            isLastInWay = true;
            ArrayList<Edge> edges = showDFSStack.peek().getEdges();
            for (Edge edge : edges) {
                Vertex v = vertices[edge.getTo()];
                if (!v.isVisited()) {
                    System.out.print(v.getValue() + " ");
                    v.setVisited(true);
                    showDFSStack.add(v);
                    isLastInWay = false;
                    break;
                }
            }

            if(isLastInWay) {
                showDFSStack.pop();
            }
        }
        cleanVisited();
        System.out.println();

    }

    private void cleanVisited() {
        for (int i = 0; i < size; i++) {
            vertices[i].setVisited(false);
        }
    }

    public int getSize() {
        return size;
    }
}
