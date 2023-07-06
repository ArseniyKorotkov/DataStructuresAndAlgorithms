package track13Graph.pack2Projects.p5;

import java.util.Stack;

public class GraphChessHorse {

    private final static int fieldSize = 6;
    private final Stack<Edge> edgeStack = new Stack<>();
    private final Stack<Vertex> vertStack = new Stack<>();

    public void askAnswer() {

        for (int i = 0; i < fieldSize * fieldSize; i++) {
            vertStack.add(new Vertex(new int[fieldSize * fieldSize], i));
            Vertex.minusCounter();
            edgeStack.add(new Edge(fieldSize));
        }

        while (Vertex.getCounter() != (fieldSize * fieldSize + 1)) {
            Edge e = edgeStack.peek();
            Vertex vert = vertStack.peek();
            if (e.hasNextStep(vert)) {
                int g = edgeStack.peek().pop();
                vertStack.add(new Vertex(vert.getField(), vert.getPosition() + g));
                edgeStack.add(new Edge(fieldSize));
                showField(vertStack.peek().getField());
            } else {
                edgeStack.pop();
                vertStack.pop();
                if(vertStack.isEmpty()) {
                    System.out.println("don`t have answer");
                    break;
                }
                Vertex.minusCounter();
            }
        }
    }

    public void showField(int[] field) {
        for (int i = 0; i < fieldSize * fieldSize; i++) {
            if (i % fieldSize == 0 && i != 0) {
                System.out.println();
            }
            String s = String.valueOf(field[i]);
            if (s.length() > 1)
                System.out.print(field[i] + " ");
            else
                System.out.print(field[i] + "  ");
        }
        System.out.println();
        System.out.println();
    }
}
