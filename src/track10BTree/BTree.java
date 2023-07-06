package track10BTree;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BTree {

    private int nodeSize;
    private Node rootNode;
    private final Queue<Node> nodes1 = new LinkedBlockingQueue<>();
    private final Queue<Node> nodes2 = new LinkedBlockingQueue<>();

    public BTree() {}

    public BTree(int nodeSize) {
        this.nodeSize = nodeSize;
    }

    public void insert(long value) {
        if (nodeSize < 1) {
            insert234(value);
        } else {
            insertB(value);
        }
    }

    private void insertB(long value) {
        DataItem item = new DataItem(value);
        if (rootNode == null) {
            rootNode = new Node();
            rootNode.add(item);
        } else {
            Node current = rootNode;
            while (true) {

                for (int i = current.size() - 1; i >= -1; i--) {

                    if (i == -1) {
                        if (current.getFirstNode() != null) {
                            current = current.getFirstNode();
                        }
                        break;
                    }

                    if (value > current.getItem(i).getValue()) {
                        if (current.getFirstNode() != null) {
                            current = current.getItem(i).getNextNode();
                        }
                        break;
                    }
                }

                if (current.getFirstNode() == null) {
                    current.add(item);
                    if (current.size() == nodeSize + 1) {
                        current.rebuildNodeB(nodeSize);
                    }
                    if(rootNode.getParentNode() != null) {
                        rootNode = rootNode.getParentNode();
                    }
                    break;
                }

            }
        }
    }

    private void insert234(long value) {
        DataItem item = new DataItem(value);
        if (rootNode == null) {
            rootNode = new Node();
            rootNode.add(item);
        } else {
            Node current = rootNode;

            while (true) {
                if (current.size() == 3) {
                    if (current.getParentNode() == null) {
                        current.rebuildNode234();
                        rootNode = current.getParentNode();
                    } else {
                        current.rebuildNode234();
                    }
                    current = current.getParentNode();
                }

                if (current.getFirstNode() == null) {
                    current.add(item);
                    break;
                } else {
                    if (value <= current.getItem(0).getValue()) {
                        current = current.getFirstNode();
                    } else {
                        for (int i = current.size() - 1; i >= 0; i--) {
                            if (value > current.getItem(i).getValue()) {
                                current = current.getItem(i).getNextNode();
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    public long minValue() {
        Node current = rootNode;
        while(current.getFirstNode() != null) {
            current = current.getFirstNode();
        }
        return current.getItem(0).getValue();
    }
    public void showTree() {
        if (rootNode == null) {
            System.out.println("Tree is empty");
            return;
        }
        boolean hasNext = true;
        nodes1.add(rootNode);
        while (true) {
            while (!nodes1.isEmpty()) {
                Node n = nodes1.poll();
                n.showNode();
                System.out.print("       ");
                if (n.getFirstNode() == null) {
                    hasNext = false;
                } else {
                    nodes2.add(n.getFirstNode());

                    for (int i = 0; i < n.size(); i++) {
                        nodes2.add(n.getItem(i).getNextNode());
                    }
                }
            }
            if (!hasNext) {
                break;
            }
            System.out.println();
            while (!nodes2.isEmpty()) {
                Node n = nodes2.poll();
                n.showNode();
                System.out.print("       ");
                if (n.getFirstNode() == null) {
                    hasNext = false;
                } else {
                    nodes1.add(n.getFirstNode());

                    for (int i = 0; i < n.size(); i++) {
                        nodes1.add(n.getItem(i).getNextNode());
                    }
                }
            }
            if (!hasNext) {
                break;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++");
    }

}
