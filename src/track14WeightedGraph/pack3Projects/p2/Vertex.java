package track14WeightedGraph.pack3Projects.p2;

import java.util.ArrayList;

public class Vertex {

    private final ArrayList<Edge> edges = new ArrayList<>();
    private boolean isVisited;
    private final char value;

    public Vertex(char value) {
        this.value = value;
    }

    public void addEdge(int to, int weight) {
        edges.add(new Edge(to, weight));
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public char getValue() {
        return value;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
}
