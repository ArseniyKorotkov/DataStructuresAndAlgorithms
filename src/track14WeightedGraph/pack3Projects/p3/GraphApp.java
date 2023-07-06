package track14WeightedGraph.pack3Projects.p3;

public class GraphApp {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');

        graph.addEdge(0,1,5);
        graph.addEdge(0,3,8);
        graph.addEdge(1,2,6);
        graph.addEdge(1,3,1);
        graph.addEdge(2,4,1);
        graph.addEdge(3,4,7);

        System.out.println("Before Floyd algorithm:");
        graph.showEdges();
        graph.doFloydAlgorithm();
        System.out.println("After Floyd algorithm:");
        graph.showEdges();

    }
}
