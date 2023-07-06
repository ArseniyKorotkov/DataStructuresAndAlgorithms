package track14WeightedGraph.pack3Projects.p4;

public class Edge {

    private final int to;
    private final int weight;

    public Edge(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }

    public int getTo() {
        return to;
    }

    public int getWeight() {
        return weight;
    }
}
