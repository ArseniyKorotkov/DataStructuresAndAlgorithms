package track14WeightedGraph.pack3Projects.p4;

public class GraphApp {

    public static void main(String[] args) {
        Graph graph = new Graph(20);

        Vertex vertA = new Vertex('A');
        vertA.addEdge(1, 91);
        vertA.addEdge(2, 62);
        vertA.addEdge(3, 55);
        Vertex vertB = new Vertex('B');
        vertB.addEdge(0, 91);
        vertB.addEdge(2, 44);
        vertB.addEdge(4, 31);
//        vertB.addEdge(5, 5);
        Vertex vertC = new Vertex('C');
        vertC.addEdge(0, 62);
        vertC.addEdge(1, 44);
        vertC.addEdge(3, 52);
        vertC.addEdge(4, 45);
        Vertex vertD = new Vertex('D');
        vertD.addEdge(0,55);
        vertD.addEdge(2,52);
        vertD.addEdge(4,83);
        Vertex vertE = new Vertex('E');
        vertE.addEdge(1,31);
        vertE.addEdge(2,45);
        vertE.addEdge(3,83);
//        vertE.addEdge(5,5);
        Vertex vertF = new Vertex('F');
        vertF.addEdge(1,5);
        vertF.addEdge(4,5);
        graph.addVertex(vertA);
        graph.addVertex(vertB);
        graph.addVertex(vertC);
        graph.addVertex(vertD);
        graph.addVertex(vertE);
//        graph.addVertex(vertF);

        System.out.println("All Hamiltonian cycles:");
        System.out.println();
        graph.theTravelingSalesmanProblem(0);
    }
}
