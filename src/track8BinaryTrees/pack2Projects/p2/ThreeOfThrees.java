package track8BinaryTrees.pack2Projects.p2;

import track8BinaryTrees.pack1BinaryFindTree.Node;
import track8BinaryTrees.pack2Projects.p1.BinaryThree;


public class ThreeOfThrees {

    private Node[] array;

    private BinaryThree[] threes= new BinaryThree[100];

    public void insert(String letter) {
        if(threes[0] == null) {
            threes[0] = new BinaryThree();
        }
        threes[0].insert(letter);
        if(threes[0].getSize() == 1) {
            threes[0].setInsideSize(1);
        } else {
            threes[0].setInsideSize(2);
        }
        if(threes[0].getSize() == 2) {
            int i;
            for (i = 0; i < threes.length; i++) {
                if(threes[i] == null){
                    break;
                }
            }
            threes[i] = threes[0];
            assert threes[i] != null;
            threes[i].setSize(3);
            threes[0] = null;
        }

        for (int i = 0; i < threes.length; i++) {
            for (int j = 0; j < threes.length; j++) {
                if(threes[i] != null && threes[j] != null && i != j && threes[i].getSize() == threes[j].getSize()) {
                    BinaryThree binaryThree = new BinaryThree();
                    binaryThree.insert("*");
                    binaryThree.getRootNode().setLeftChild(threes[i].getRootNode());
                    binaryThree.getRootNode().setRightChild(threes[j].getRootNode());
                    binaryThree.setSize(threes[i].getSize() + threes[j].getSize() + 1);
                    binaryThree.setInsideSize(threes[i].getInsideSize() + 1);
                    threes[j] = binaryThree;
                    threes[i] = null;
                }
            }
        }

    }

    public void showSizes() {
        for (int i = 0; i < threes.length; i++) {
            if(threes[i] == null) {
                System.out.print(0 + " ");
            } else {
                System.out.print(threes[i].getSize() + " ");
            }
        }
    }



    public void showThree(int threeNumber) {
        Node[] showArray = generateArray(threeNumber);

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

    private Node[] generateArray(int threeNumber) {

        array = new Node[countAllSlots(threeNumber)];

        addNoteArray(threes[threeNumber].getRootNode(), 1);


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

    private int countAllSlots(int threeNumber) {
        int slotCounter = 0;
        int stringSlotCounter = 1;
        for (int i = 0; i < threes[threeNumber].getInsideSize(); i++) {
            slotCounter = slotCounter + stringSlotCounter;
            stringSlotCounter *= 2;
        }
        return slotCounter;
    }

    public BinaryThree getThree(int numberThree) {
        return threes[numberThree];
    }
}
