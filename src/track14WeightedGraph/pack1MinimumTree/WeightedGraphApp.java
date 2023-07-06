package track14WeightedGraph.pack1MinimumTree;

import java.util.LinkedList;
import java.util.List;

public class WeightedGraphApp {

    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph();

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');

        graph.addEdge(0,1,6);
        graph.addEdge(1,0,6);
        graph.addEdge(0,3,4);
        graph.addEdge(3,0,4);
        graph.addEdge(1,3,7);
        graph.addEdge(3,1,7);
        graph.addEdge(1,2,10);
        graph.addEdge(2,1,10);
        graph.addEdge(1,4,7);
        graph.addEdge(4,1,7);
        graph.addEdge(2,3,8);
        graph.addEdge(3,2,8);
        graph.addEdge(3,4,12);
        graph.addEdge(4,3,12);
        graph.addEdge(2,4,5);
        graph.addEdge(4,2,5);
        graph.addEdge(2,5,6);
        graph.addEdge(5,2,6);
        graph.addEdge(4,5,7);
        graph.addEdge(5,4,7);

        List<LinkedList<WeightedEdge>> min = graph.minimum(0);

        for(LinkedList<WeightedEdge> list : min) {
            if(list != null) {
                for (WeightedEdge edge : list) {
                    System.out.print(edge.getTo() + " ");
                }
            }
            System.out.println();
        }

    }
}
