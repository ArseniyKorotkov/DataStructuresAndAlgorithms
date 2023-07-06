package track14WeightedGraph.pack3Projects.p2;

public class GraphApp {

    public static void main(String[] args) {
        Graph graph = new Graph(20);

        Vertex vertA = new Vertex('A');
        vertA.addEdge(1, 50);
        vertA.addEdge(3, 80);
        Vertex vertB = new Vertex('B');
        vertB.addEdge(2, 60);
        vertB.addEdge(3, 90);
        Vertex vertC = new Vertex('C');
        vertC.addEdge(4, 40);
        Vertex vertD = new Vertex('D');
        vertD.addEdge(4,70);
        graph.addVertex(vertA);
        graph.addVertex(vertB);
        graph.addVertex(vertC);
        graph.addVertex(vertD);
        graph.addFreeVertex('E');

        graph.showBFS(0);
        System.out.println();
        for (int i = 0; i < graph.getSize(); i++) {
            graph.showDFS(i);
        }
    }
}
