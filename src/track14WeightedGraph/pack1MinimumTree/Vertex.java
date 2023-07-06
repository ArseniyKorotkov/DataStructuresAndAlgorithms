package track14WeightedGraph.pack1MinimumTree;

public class Vertex {

    private final char value;
    private boolean isVisited;

    public Vertex(char value) {
        this.value = value;
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
