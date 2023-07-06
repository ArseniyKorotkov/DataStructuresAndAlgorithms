package track10BTree;

public class DataItem {

    private final long value;
    private Node nextNode;

    public DataItem(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
