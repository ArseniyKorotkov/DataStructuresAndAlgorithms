package track8BinaryTrees.pack1BinaryFindTree;

public class Node {

    private Node leftChild;
    private Node rightChild;
    private final Operation operation;

    public Node(Operation value) {
        this.operation = value;
    }

    public Operation getOperation() {
        return operation;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
