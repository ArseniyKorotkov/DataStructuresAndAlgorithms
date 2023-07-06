package track13Graph.pack2Projects.p2;

public class GraphApp {

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');
        graph.addVertex('I');

        graph.addEdge(0, 1);
//        graph.addEdge(1, 0);
        graph.addEdge(1, 5);
//        graph.addEdge(5, 1);
        graph.addEdge(5, 7);
//        graph.addEdge(7, 5);
        graph.addEdge(0, 2);
//        graph.addEdge(2, 0);
        graph.addEdge(0, 3);
//        graph.addEdge(3, 0);
        graph.addEdge(3, 6);
//        graph.addEdge(6, 3);
        graph.addEdge(6, 8);
//        graph.addEdge(8, 6);
        graph.addEdge(0, 4);
//        graph.addEdge(4, 0);

        graph.addEdge(7, 8);

        graph.showGraphBFS(0);
        graph.showGraphDFS(0);


    }
}
