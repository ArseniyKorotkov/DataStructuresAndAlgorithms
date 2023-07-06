package track10BTree;

import java.util.ArrayList;

public class Node {

    private final ArrayList<DataItem> items;
    private Node firstNode;
    private Node parentNode;

    public Node() {
        items = new ArrayList<>();
    }

    public void add(DataItem item) {
        if (items.isEmpty()) {
            items.add(item);
        } else {
            int i;
            for (i = size() - 1; i > -1; i--) {
                if (items.get(i).getValue() < item.getValue()) {
                    items.add(i + 1, item);
                    break;
                }
            }
            if (i == -1) {
                items.add(0, item);
            }
        }
    }

    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }

    public Node getParentNode() {
        return parentNode;
    }

    public Node getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    public DataItem getItem(int index) {
        return items.get(index);
    }

    public int size() {
        return items.size();
    }

    public void rebuildNode234() {
        if (parentNode == null) {
            parentNode = new Node();
            parentNode.setFirstNode(this);
        }

        Node thirtyNode = new Node();
        thirtyNode.setFirstNode(items.get(1).getNextNode());
        if (thirtyNode.getFirstNode() != null) {
            thirtyNode.getFirstNode().setParentNode(thirtyNode);
        }

        thirtyNode.setParentNode(parentNode);
        if (items.get(2).getNextNode() != null) {
            items.get(2).getNextNode().setParentNode(thirtyNode);
        }
        thirtyNode.add(items.get(2));
        items.remove(2);

        items.get(1).setNextNode(thirtyNode);
        parentNode.add(items.get(1));
        items.remove(1);

    }


    public void rebuildNodeB(int nodeSize) {

        if (parentNode == null) {
            parentNode = new Node();
            parentNode.setFirstNode(this);
        }

        int avgPosition = nodeSize / 2;

//        if you have a lot double values use it ->
/*

        long avg = 0;
        for (int i = 0; i < items.size(); i++) {
            avg += items.get(i).getValue();
        }
        avg = avg / items.size();
        for (avgPosition = items.size() - 1; avgPosition > 1; avgPosition--) {
            if (items.get(avgPosition).getValue() < avg) {
                break;
            }
        }

*/

        DataItem avgItem = items.get(avgPosition);

        Node threeNode = new Node();
        threeNode.setParentNode(parentNode);

        for (int i = avgPosition; i < nodeSize + 1; i++) {
            DataItem item = items.get(i);
            if (i != avgPosition) {
                threeNode.add(item);
            }
            if (item.getNextNode() != null) {
                item.getNextNode().setParentNode(threeNode);
            }
        }

        threeNode.setFirstNode(avgItem.getNextNode());

        avgItem.setNextNode(threeNode);


        parentNode.add(avgItem);
        if (parentNode.size() == nodeSize + 1) {
            parentNode.rebuildNodeB(nodeSize);
        }

        for (int i = avgPosition; i < nodeSize + 1; i++) {
            items.remove(avgPosition);
        }

    }



    public void showNode() {
        for (DataItem item : items) {
            System.out.print(item.getValue() + " ");
        }
    }
}
