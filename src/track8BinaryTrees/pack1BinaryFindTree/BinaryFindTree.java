package track8BinaryTrees.pack1BinaryFindTree;

import java.util.NoSuchElementException;

public class BinaryFindTree {

    private Node rootNode;
    private int size;
    private int insideSize;
    private Node[] array;

    public void insert(Operation operation) {
        int checkInsideSize = 1;
        Node newNode = new Node(operation);
        if (isEmpty()) {
            rootNode = newNode;
            insideSize++;
        } else {
            Node current = rootNode;
            while (true) {
                checkInsideSize++;
                if (current.getOperation().getPlaceNumber() > operation.getPlaceNumber()) {
                    if (current.getLeftChild() == null) {
                        current.setLeftChild(newNode);
                        break;
                    } else {
                        current = current.getLeftChild();
                    }
                } else {
                    if (current.getRightChild() == null) {
                        current.setRightChild(newNode);
                        break;
                    } else {
                        current = current.getRightChild();
                    }
                }
            }
            if (checkInsideSize > insideSize) {
                insideSize = checkInsideSize;
            }
        }

        size++;
    }

    public Operation find(int placeNumber) {
        Node current = rootNode;
        while (current.getOperation().getPlaceNumber() != placeNumber) {

            if (current.getOperation().getPlaceNumber() < placeNumber) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
            if (current == null) {
                throw new NoSuchElementException();
            }

        }
        return current.getOperation();
    }

    public Operation delete(int placeNumber) {
        Node current = rootNode;
        Node parent = rootNode;
        boolean isLeft = false;
        if (rootNode == null) {
            return null;
        }
        while (current.getOperation().getPlaceNumber() != placeNumber) {
            parent = current;
            if (current.getOperation().getPlaceNumber() < placeNumber) {
                current = current.getRightChild();
                isLeft = false;
            } else {
                current = current.getLeftChild();
                isLeft = true;
            }
        }

        if (current.getRightChild() == null && current.getLeftChild() == null) {
            if (current == rootNode) {
                rootNode = null;
            } else {
                if (isLeft) {
                    parent.setLeftChild(null);
                } else {
                    parent.setRightChild(null);
                }
            }
        } else if (current.getRightChild() != null && current.getLeftChild() != null) {
            Node changer = current.getRightChild();
            while (changer.getLeftChild() != null) {
                changer = changer.getLeftChild();
            }
            delete(changer.getOperation().getPlaceNumber());
            changer.setLeftChild(current.getLeftChild());
            changer.setRightChild(current.getRightChild());
            if (current != rootNode) {
                if (isLeft) {
                    parent.setLeftChild(changer);
                } else {
                    parent.setRightChild(changer);
                }
            } else {
                rootNode = changer;
            }

        } else {
            if (current.getRightChild() == null) {
                if (current == rootNode) {
                    rootNode = current.getLeftChild();
                } else if (isLeft) {
                    parent.setLeftChild(current.getLeftChild());
                } else {
                    parent.setRightChild(current.getLeftChild());
                }
            } else {
                if (current == rootNode) {
                    rootNode = current.getRightChild();
                } else if (isLeft) {
                    parent.setLeftChild(current.getRightChild());
                } else {
                    parent.setRightChild(current.getRightChild());
                }
            }

        }

        size--;

        return current.getOperation();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void showThreeString(Node parentNode) {
        if (parentNode == null) {
            return;
        }
        showThreeString(parentNode.getLeftChild());

        System.out.print(parentNode.getOperation().getOperator() + " ");
//        System.out.print(parentNode.getOperation().getPlaceNumber() + " ");

        showThreeString(parentNode.getRightChild());

    }

    public void showThree() {
        Node[] showArray = generateArray();

        int oldI = 0;
        int spaceWithElements = showArray.length / 2;
        for (int i = 0; i < showArray.length; i++) {

            for (int j = 0; j < spaceWithElements; j++) {
                System.out.print("   ");
            }

            if (showArray[i] == null) {
                System.out.print(" - ");
            } else {
                System.out.print(" " + showArray[i].getOperation().getOperator() + " ");
            }

            for (int j = 0; j < spaceWithElements + 1; j++) {
                System.out.print("   ");
            }

            if (i == oldI * 2 + 2 || i == 0) {
                if (i != 0) {
                    oldI = i;
                }
                System.out.println();
                spaceWithElements = spaceWithElements / 2;
            }


        }
    }

    private Node[] generateArray() {

        array = new Node[countAllSlots()];

        addNoteArray(rootNode, 1);


        return array;
    }

    private void addNoteArray(Node parentNode, int numberPlace) {
        if (parentNode == null) {
            return;
        }
        array[numberPlace - 1] = parentNode;
        addNoteArray(parentNode.getLeftChild(), numberPlace * 2);
        addNoteArray(parentNode.getRightChild(), (numberPlace * 2) + 1);
    }

    private int countAllSlots() {
        int slotCounter = 0;
        int stringSlotCounter = 1;
        for (int i = 0; i < insideSize; i++) {
            slotCounter = slotCounter + stringSlotCounter;
            stringSlotCounter *= 2;
        }
        return slotCounter;
    }

    public Node getRootNode() {
        return rootNode;
    }

    public int getInsideSize() {
        return insideSize;
    }
}
