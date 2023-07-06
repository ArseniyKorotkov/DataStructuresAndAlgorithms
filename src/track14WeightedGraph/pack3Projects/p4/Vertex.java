package track14WeightedGraph.pack3Projects.p4;

import java.util.ArrayList;
import java.util.Stack;

public class Vertex {

    private final ArrayList<Edge> edges = new ArrayList<>();
    private final Stack<Edge> edgeStack = new Stack<>();
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

    public void reinsertStack() {
        edgeStack.clear();
        edgeStack.addAll(edges);
    }

    public Edge stackPop() {
        return edgeStack.pop();
    }

    public Edge stackPeek() {
        return edgeStack.peek();
    }

    public boolean stackIsEmpty() {
        return edgeStack.isEmpty();
    }

    public int wayLength() {
        return edges.get(edgeStack.size()).getWeight();
    }
}
