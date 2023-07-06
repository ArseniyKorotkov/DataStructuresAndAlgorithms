package track13Graph.pack2Projects.p4;

public class GraphApp {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(5,1);
        graph.addEdge(5,7);
        graph.addEdge(5,2);
        graph.addEdge(0,5);
        graph.addEdge(0,8);
        graph.addEdge(8,6);
        graph.addEdge(6,3);
        graph.addEdge(0,4);

        graph.addEdge(8,7);


        graph.showEdgeMatrix();

        graph.transitiveClosure();

        graph.showEdgeMatrix();
    }
}
