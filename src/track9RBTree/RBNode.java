package track9RBTree;

public class RBNode {

    private RBNode leftChild;
    private RBNode rightChild;
    private boolean isBlack;
    private final long value;

    public RBNode(long value) {
        this.value = value;
    }

    public RBNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(RBNode leftChild) {
        this.leftChild = leftChild;
    }

    public RBNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(RBNode rightChild) {
        this.rightChild = rightChild;
    }

    public boolean isBlack() {
        return isBlack;
    }

    public void setBlack(boolean black) {
        isBlack = black;
    }

    public long getValue() {
        return value;
    }
}
