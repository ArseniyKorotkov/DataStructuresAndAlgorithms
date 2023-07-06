package track12Heap.pack2HeapWithTree;

public class Heap {

    private Node rootNode;
    private int size;
    private boolean isOrdered = true;

    public void add(long value) {
        if (!isOrdered) {
            System.out.println("Don`t can add. Need do ordered");
            return;
        }
        doUp(insert(value));
    }

    public Long peek() {
        if (!isOrdered) {
            System.out.println("Don`t can peek. Need do ordered");
        }
        if (!isEmpty() && isOrdered) {
            return rootNode.getValue();
        } else {
            return null;
        }
    }

    public Long pop() {
        if (!isOrdered) {
            System.out.println("Don`t can pop. Need do ordered");
        }
        if (isEmpty() || !isOrdered) return null;
        long pop = rootNode.getValue();
        if (size == 1) {
            rootNode = null;
        } else {
            Node lastNode = askNode(size);
            rootNode.setValue(lastNode.getValue());
            if (size % 2 == 0) {
                lastNode.getParent().setLeftChild(null);
            } else {
                lastNode.getParent().setRightChild(null);
            }


            doDown(rootNode);
        }
        size--;


        return pop;
    }


    public Node insert(long value) {
        isOrdered = false;
        size++;
        Node node = new Node(value);
        if (size == 1) {
            rootNode = node;
        } else {
            Node parent = askNode(size / 2);
            if (size % 2 == 0) {
                parent.setLeftChild(node);
            } else {
                parent.setRightChild(node);
            }
            node.setParent(parent);
        }
        return node;
    }

    public void doOrder() {
        for (int i = size / 2; i < 0; i--) {
            doDown(askNode(i));
        }
        isOrdered = true;
    }


    private void doDown(Node node) {
        long spare = node.getValue();
        Node current = node;
        while (current.getLeftChild() != null) {
            if (current.getRightChild() != null && current.getRightChild().getValue() < current.getLeftChild().getValue()) {
                if (current.getRightChild().getValue() < spare) {
                    current.setValue(current.getRightChild().getValue());
                    current = current.getRightChild();
                    continue;
                } else {
                    break;
                }
            }

            if (current.getLeftChild().getValue() < spare) {
                current.setValue(current.getLeftChild().getValue());
                current = current.getLeftChild();
            } else {
                break;
            }

        }
        current.setValue(spare);
        isOrdered = true;
    }

    private void doUp(Node node) {
        Node current = node;
        long spare = node.getValue();
        while (current.getParent() != null && current.getParent().getValue() > spare) {
            current.setValue(current.getParent().getValue());
            current = current.getParent();
        }

        current.setValue(spare);

        isOrdered = true;

    }

    private Node askNode(int position) {
        if (position == 1) {
            return rootNode;
        } else {
            Node current = rootNode;
            String way = Integer.toBinaryString(position);
            for (int i = 1; i < way.length(); i++) {
                if (current == null) {
                    return null;
                }
                if (way.charAt(i) == '0') {
                    current = current.getLeftChild();
                } else {
                    current = current.getRightChild();
                }
            }
            return current;
        }
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public void showTree() {
        for (int i = 1; i <= size; i++) {
            System.out.print(askNode(i).getValue() + " ");
        }
        System.out.println();
    }
}
