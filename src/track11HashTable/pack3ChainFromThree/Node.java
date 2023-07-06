package track11HashTable.pack3ChainFromThree;

import track11HashTable.Person;

public class Node {

    private Node leftChild;
    private Node rightChild;
    private final Person person;

    public Node(Person value) {
        this.person = value;
    }

    public Person getPerson() {
        return person;
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
