package track13Graph.pack2Projects.p5;

import java.util.Stack;

public class Edge {

    private final int fieldSize;
    private final Stack<Integer> steps = new Stack<>();

    public Edge(int fieldSize) {
        this.fieldSize = fieldSize;
        steps.add((fieldSize * (-2)) - 1);
        steps.add((fieldSize * (-2)) + 1);
        steps.add((fieldSize * (-1)) - 2);
        steps.add((fieldSize * (-1)) + 2);
        steps.add((fieldSize * 2) - 1);
        steps.add((fieldSize * 2) + 1);
        steps.add((fieldSize) - 2);
        steps.add((fieldSize) + 2);
    }

    public int pop() {
        return steps.pop();
    }

    public boolean hasNextStep(Vertex peek) {
        while (!isEmpty() && !nextStepReally(peek)) {
            steps.pop();
        }
        return !isEmpty();
    }

    public int peek() {
        return steps.peek();
    }

    public boolean isEmpty() {
        return steps.isEmpty();
    }

    private boolean nextStepReally(Vertex peek) {

        if (peek.getPosition() % fieldSize == 0 && (steps.size() == 1 || steps.size() == 5)) {
            return false;
        }

        if (peek.getPosition() % fieldSize == fieldSize - 1 && (steps.size() == 2 || steps.size() == 6)) {
            return false;
        }

        if ((peek.getPosition() % fieldSize == 1 || peek.getPosition() % fieldSize == 0)
            && (steps.size() == 3 || steps.size() == 7)) {
            return false;
        }

        if ((peek.getPosition() % fieldSize == fieldSize - 2 || peek.getPosition() % fieldSize == fieldSize - 1)
            && (steps.size() == 4 || steps.size() == 8)) {
            return false;
        }

        if (peek.getPosition() / fieldSize < 2 && (steps.size() == 1 || steps.size() == 2)) {
            return false;
        }

        if (peek.getPosition() / fieldSize > fieldSize * 2 && (steps.size() == 5 || steps.size() == 6)) {
            return false;
        }

        if (peek.getPosition() / fieldSize < 1 && (steps.size() == 3 || steps.size() == 4)) {
            return false;
        }

        if (peek.getPosition() / fieldSize == (fieldSize - 1) && (steps.size() == 7 || steps.size() == 8)) {
            return false;
        }

        if (peek.getPosition() + steps.peek() < 0 || peek.getPosition() + steps.peek() >= fieldSize * fieldSize) {
            return false;
        }

        return peek.getField()[peek.getPosition() + steps.peek()] == 0;
    }
}
