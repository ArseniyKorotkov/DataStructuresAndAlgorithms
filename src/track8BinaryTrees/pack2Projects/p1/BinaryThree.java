package track8BinaryTrees.pack2Projects.p1;

import track8BinaryTrees.pack1BinaryFindTree.Node;
import track8BinaryTrees.pack1BinaryFindTree.Operation;

public class BinaryThree {

    private Node rootNode;
    private int size;
    private int insideSize;

    public void insert(String value) {
        if (rootNode == null) {
            rootNode = new Node(new Operation(value, 0));
        } else {
            Node nextNode = new Node(new Operation("+", 0));
            nextNode.setLeftChild(rootNode);
            nextNode.setRightChild(new Node(new Operation(value, 0)));
            rootNode = nextNode;
        }
        size++;
    }

    public void showThree(Node parent, int level) {

        if (level == 0) {
            for (int i = 0; i < size - level - 1; i++) {
                System.out.print(" ");
            }
        } else {
            System.out.print(" ");
        }
        System.out.println(parent.getOperation().getOperator());
        if (parent.getLeftChild() != null) {
            for (int i = 0; i < size - level - 2; i++) {
                System.out.print(" ");
            }

            System.out.print(parent.getRightChild().getOperation().getOperator());

            showThree(parent.getLeftChild(), level + 1);
        }
    }

    public void showStringThree() {
        doString(rootNode);
    }

    private void doString(Node parent) {
        if(parent == null) {
            return;
        }
        System.out.print(parent.getOperation().getOperator() + " ");
        doString(parent.getLeftChild());
        doString(parent.getRightChild());
    }


    public Node getRootNode() {
        return rootNode;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getInsideSize() {
        return insideSize;
    }

    public void setInsideSize(int insideSize) {
        this.insideSize = insideSize;
    }
}
