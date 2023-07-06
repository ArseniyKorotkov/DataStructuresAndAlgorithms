package track14WeightedGraph.pack3Projects.p4;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class Graph {

    private final Vertex[] vertices;
    private final Queue<Vertex> showBFSQueue = new LinkedBlockingQueue<>();
    private final Stack<Vertex> showDFSStack = new Stack<>();
    private final Stack<Vertex> travelingStack = new Stack<>();
    private int funnyCounter;
    private int shortestWay;

    private int size;

    public Graph(int capacity) {
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
            if (showBFSQueue.isEmpty()) {
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

            if (isLastInWay) {
                showDFSStack.pop();
            }
        }
        cleanVisited();
        System.out.println();

    }

    public void theTravelingSalesmanProblem(int start) {
        for (int i = 0; i < size; i++) {
            vertices[i].reinsertStack();
        }
        travelingStack.add(vertices[start]);
        vertices[start].setVisited(true);
        Vertex current;

        while (!travelingStack.isEmpty()) {
            current = travelingStack.peek();

            while (!current.stackIsEmpty()) {
                vertices[start].setVisited(travelingStack.size() != size);

                if (!vertices[current.stackPeek().getTo()].isVisited()) {
                    current = vertices[current.stackPop().getTo()];
                    current.setVisited(true);
                    travelingStack.add(current);
                    if (travelingStack.size() == size + 1) {
                        break;
                    }
                } else {
                    current.stackPop();
                }

            }

            if (travelingStack.size() == size + 1) {
                showWay(start);
                travelingStack.pop().setVisited(true);
            }

            travelingStack.peek().setVisited(false);
            travelingStack.pop().reinsertStack();
        }
        cleanVisited();
        funnyCounter = 0;

    }

    public void showWay(int start) {
        ArrayList<Vertex> answerVertices = new ArrayList<>(travelingStack);

        int way = 0;

        for (Vertex v : answerVertices) {
            way += v.wayLength();
            System.out.print(v.getValue() + " " + v.wayLength() + "  ");
        }
        System.out.println(" = " + (way - vertices[start].wayLength()));
        if (shortestWay == 0 || shortestWay > way) {
            shortestWay = way;
            if (funnyCounter == 0) {
                System.out.print("This is shortest way!");
            } else {
                System.out.print("NO! This is shortest way!");
            }
            for (int i = 0; i < funnyCounter * 2; i++) {
                System.out.print("!");
            }
            System.out.println();
            funnyCounter++;
        }
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
