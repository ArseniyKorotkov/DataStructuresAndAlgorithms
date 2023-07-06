package track14WeightedGraph.pack2MinimumWaysDijkstra;

public class Vertex {
    private final char label;
    private boolean isVisited;
    private boolean hasInfinity;

    public Vertex(char value) {
        this.label = value;
    }

    public char getLabel() {
        return label;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public boolean hasInfinity() {
        return hasInfinity;
    }

    public void setHasInfinity(boolean hasInfinity) {
        this.hasInfinity = hasInfinity;
    }
}
