package track14WeightedGraph.pack2MinimumWaysDijkstra.fromBook;

public class DistPar
{
    private int distance;
    private int parentVert;

    public DistPar(int parentVert, int distance) {
        this.distance = distance;
        this.parentVert = parentVert;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getParentVert() {
        return parentVert;
    }

    public void setParentVert(int parentVert) {
        this.parentVert = parentVert;
    }
}
