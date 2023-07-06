package track8BinaryTrees.pack2Projects.p3;

import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class LetterThree {

    private Node rootNode;
    private int size;
    private Stack<Integer> positions = new Stack<>();

    public void insert(char letter) {
        Node newNode = new Node(letter);
        if (rootNode == null) {
            rootNode = newNode;
        } else {
            Node current = rootNode;
            addPositions(size + 1);
            while (!positions.isEmpty()) {
                if (positions.pop() % 2 == 0) {
                    current = current.getLeftChild();
                } else {
                    current = current.getRightChild();
                }
            }
            if (size % 2 == 1) {
                current.setLeftChild(newNode);
            } else {
                current.setRightChild(newNode);
            }
        }
        size++;
    }

    private void addPositions(int position) {
        while ((position /= 2) != 1) {
            positions.add(position);
        }
    }

    public Node getRootNode() {
        return rootNode;
    }

    public void showThree() {
        doShow(rootNode);
    }

    private void doShow(Node parent) {
        if(parent == null) {
            return;
        }
        System.out.print(parent.getValue() + " ");
        doShow(parent.getLeftChild());
        doShow(parent.getRightChild());
    }


}
