package track14WeightedGraph.pack1MinimumTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class WeightedGraph {

    private final List<Vertex> vertexList = new ArrayList<>();
    private final List<LinkedList<WeightedEdge>> edges = new ArrayList<>();
    private final static int CAPACITY = 20;
    PriorityQueue<WeightedEdge> priorityQueue = new PriorityQueue<>();

    public WeightedGraph() {
        for (int i = 0; i < CAPACITY; i++) {
            edges.add(new LinkedList<>());
        }
    }

    public void addVertex(char c) {
        vertexList.add(new Vertex(c));
    }

    public void addEdge(int from, int to, int weight) {
        edges.get(from).add(new WeightedEdge(from,to, weight));
    }

    public List<LinkedList<WeightedEdge>> minimum(int start) {
        List<LinkedList<WeightedEdge>> minimumEdges = new ArrayList<>();
        for (int i = 0; i < vertexList.size(); i++) {
            minimumEdges.add(new LinkedList<>());
        }
        int counter = 0;
        vertexList.get(start).setVisited(true);
        int current = 0;

        while (counter != vertexList.size() - 1) {
//            for(WeightedEdge edge : edges.get(current)) {
//                if(!vertexList.get(edge.getTo()).isVisited()) {
//                    priorityQueue.add(edge);
//                }
//            }
            priorityQueue.addAll(edges.get(current));

            while (!priorityQueue.isEmpty()) {
                WeightedEdge edge = priorityQueue.poll();
                if (!vertexList.get(edge.getTo()).isVisited()) {
                    minimumEdges.get(edge.getFrom()).add(edge);
                    current = edge.getTo();
                    vertexList.get(current).setVisited(true);
                    counter++;
                    break;
                }
            }
        }

        cleanVisits();

        return minimumEdges;
    }

    private void cleanVisits() {
        for(Vertex v : vertexList) {
            v.setVisited(false);
        }
    }
}
