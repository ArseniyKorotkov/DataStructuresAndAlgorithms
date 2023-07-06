package track13Graph.pack1Graph;

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

//        graph.addEdge(7, 8);
//        graph.addEdge(5, 6);


        graph.showGraphDFSRecursion(0);
        System.out.println();
        graph.showGraphDFS(0);
        System.out.println();
        graph.showGraphBFS(0, false);
        System.out.println();
        System.out.println(graph.countEdge());
        graph.showTopo();

    }
}
