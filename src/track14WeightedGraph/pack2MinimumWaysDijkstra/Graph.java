package track14WeightedGraph.pack2MinimumWaysDijkstra;

import java.util.PriorityQueue;

public class Graph {

    private Vertex[] vertexes;
    private int[][] edges;
    private PriorityQueue<Integer>[] queues;
    private int vertexCounter;
    private int vertexCapacity;

    public Graph(int capacity) {
        vertexCapacity = capacity;
        vertexes = new Vertex[vertexCapacity];
        edges = new int[vertexCapacity][vertexCapacity];
    }

    public void addVertex(char c) {
        if (vertexCounter < vertexCapacity) {
            vertexes[vertexCounter++] = new Vertex(c);
        }
    }

    public void addEdge(int from, int to, int weight) {
        edges[from][to] = weight;
    }

    public void minimumWaysFrom(int position) {
        queues = new PriorityQueue[vertexCounter];
        for (int i = 0; i < queues.length; i++) {
            queues[i] = new PriorityQueue<>();
        }
        queues[position].add(0);

        while (true) {
            vertexes[position].setVisited(true);

            int min = 0;
            for (int i = 0; i < vertexCounter; i++) {
                if(edges[position][i] > 0 && !vertexes[i].isVisited()) {
                    int weight = edges[position][i] + queues[position].element();
                    if(weight > min) {
                        min = weight;
                    }
                    queues[i].add(weight);
                }
            }

            if(min == 0) {
                break;
            }


            for (int i = 0; i < vertexCounter; i++) {

                if(!queues[i].isEmpty() && queues[i].element() <= min && !vertexes[i].isVisited()) {
                    min = queues[i].element();
                    position = i;
                }
            }
        }

        showMinimumWay();
    }

    private void showMinimumWay(){
        for (int i = 0; i < vertexCounter; i++) {
            if(!queues[i].isEmpty()) {
                System.out.println(vertexes[i].getLabel() + " = " + queues[i].element());
            }
        }
    }
}
