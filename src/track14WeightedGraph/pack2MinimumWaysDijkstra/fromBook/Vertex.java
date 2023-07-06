package track14WeightedGraph.pack2MinimumWaysDijkstra.fromBook;

public class Vertex {
    private final char label;
    private boolean isInThree;

    public Vertex(char label) {
        this.label = label;
        this.isInThree = false;
    }

    public char getLabel() {
        return label;
    }

    public boolean isInTree() {
        return isInThree;
    }

    public void setInTree(boolean inThree) {
        isInThree = inThree;
    }
}
