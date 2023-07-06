package track13Graph.pack2Projects.p2;

import track13Graph.pack1Graph.Vertex;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class Graph {

    private LinkedList<Integer>[] edges = new LinkedList[20];
    private int edgesSize;
    private Vertex[] vertexes = new Vertex[20];
    private int vertexesSize;
    private final Queue<Integer> queueShow = new LinkedBlockingQueue<>();
    private final Stack<Integer> stackShow = new Stack<>();

    public void addEdge(int from, int to) {
        if (vertexes[from] == null || from >= vertexesSize) {
            System.out.println("don`t have this vertex");
        } else {
            if (edges[from] == null) {
                edges[from] = new LinkedList<>();
            }
            edges[from].add(to);
            edgesSize++;
        }
    }

    public void addVertex(char c) {
        vertexes[vertexesSize++] = new Vertex(c);
    }

    public void showGraphBFS(int position) {
        queueShow.add(position);
        vertexes[position].setWasVisited(true);

        while (!queueShow.isEmpty()) {
            position = queueShow.poll();
            System.out.print(vertexes[position].getLabel() + " ");

            if (edges[position] != null) {
                for (Integer i : edges[position]) {
                    if (!vertexes[i].isWasVisited()) {
                        vertexes[i].setWasVisited(true);
                        queueShow.add(i);
                    }
                }
            }

        }
        System.out.println();
        cleanVisited();
    }

    public void showGraphDFS(int position) {
        stackShow.add(position);
        System.out.print(vertexes[stackShow.peek()].getLabel() + " ");
        vertexes[stackShow.peek()].setWasVisited(true);

        while (!stackShow.isEmpty()) {
            position = stackShow.peek();
            int i = 0;
            if(edges[position] != null) {
                for (i = 0; i < edges[position].size(); i++) {
                    if (!vertexes[edges[position].get(i)].isWasVisited()) {
                        vertexes[edges[position].get(i)].setWasVisited(true);
                        System.out.print(vertexes[edges[position].get(i)].getLabel() + " ");
                        stackShow.add(edges[position].get(i));
                        break;
                    }
                }
            }
            if (edges[position] == null || i == edges[position].size()) {
                stackShow.pop();
            }

        }

        System.out.println();
        cleanVisited();
    }


    private void cleanVisited() {
        for (Vertex v : vertexes) {
            if (v != null) {
                v.setWasVisited(false);
            }
        }
    }


}
