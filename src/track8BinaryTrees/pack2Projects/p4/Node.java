package track8BinaryTrees.pack2Projects.p4;

public class Node {

    private Node leftChild;
    private Node rightChild;


    private char value;

    public Node(char value) {
        this.value = value;
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

    public char getValue() {
        return value;
    }

}
