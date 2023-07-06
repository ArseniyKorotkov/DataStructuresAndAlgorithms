package track9RBTree;

public class RBTree {

    private RBNode current;
    private RBNode parent = null;
    private RBNode grand = null;
    private RBNode rootTurn;

    private static final int HOW_MATH_ELEMENTS = 255;
    private RBNode rootNode;
    private RBNode[] array;

    public void insert(long val) {
        System.out.println("///////////start insert " + val + "/////////");
        RBNode node = new RBNode(val);

        if (rootNode == null) {
            rootNode = node;
            System.out.println("add first element " + rootNode.getValue());
            showRBT();
        } else {
            current = rootNode;

            while (true) {

                colorChange();
                if (!rootNode.isBlack()) {
                    rootNode.setBlack(true);
                    System.out.println("set rootNode black color");
                    showRBT();
                }
                if (current != null && parent != null && !current.isBlack() && !parent.isBlack()) {
                    if (grand.getValue() > parent.getValue()) {
                        rightTurn(current.getValue() > parent.getValue());
                    } else {
                        leftTurn(current.getValue() < parent.getValue());
                    }
                }

                if (node.getValue() < current.getValue()) {
                    if (current.getLeftChild() == null) {
                        current.setLeftChild(node);
                        System.out.println("add " + node.getValue());
                        showRBT();
                        rootTurn = grand;
                        grand = parent;
                        parent = current;
                        current = current.getLeftChild();
                        if (!parent.isBlack()) {
                            if (grand.getValue() > parent.getValue()) {
                                rightTurn(current.getValue() > parent.getValue());
                            } else {
                                leftTurn(current.getValue() < parent.getValue());
                            }
                        }
                        break;
                    } else {
                        rootTurn = grand;
                        grand = parent;
                        parent = current;
                        current = current.getLeftChild();
                    }
                } else {
                    if (current.getRightChild() == null) {
                        current.setRightChild(node);
                        System.out.println("add " + node.getValue());
                        showRBT();
                        rootTurn = grand;
                        grand = parent;
                        parent = current;
                        current = current.getRightChild();
                        if (!parent.isBlack()) {
                            if (grand.getValue() > parent.getValue()) {
                                rightTurn(current.getValue() > parent.getValue());
                            } else {
                                leftTurn(current.getValue() < parent.getValue());
                            }
                        }
                        break;
                    } else {
                        rootTurn = grand;
                        grand = parent;
                        parent = current;
                        current = current.getRightChild();
                    }
                }
            }

        }

        current = null;
        parent = null;
        grand = null;
    }


    private void leftTurn(boolean insideGrSon) {
        if (rootTurn == null) {
            if (insideGrSon) {
                rootNode.setRightChild(current);
                parent.setLeftChild(current.getRightChild());
                current.setRightChild(parent);
                RBNode spareNode = current;
                current = parent;
                parent = spareNode;
                System.out.println("mini right torn");
                showRBT();
            }

            rootNode.setBlack(false);
            parent.setBlack(true);
            System.out.println("reverse colors before left turn");
            showRBT();
            rootNode.setRightChild(parent.getLeftChild());
            parent.setLeftChild(rootNode);
            rootNode = parent;
            System.out.println("turn left nearby root");
            showRBT();
        } else {

            if (insideGrSon) {
                parent.setLeftChild(current.getRightChild());
                current.setRightChild(parent);
                grand.setRightChild(current);

                RBNode spareNode = parent;
                parent = current;
                current = spareNode;

                System.out.println("mini right torn");
                showRBT();
            }

            grand.setBlack(false);
            parent.setBlack(true);
            System.out.println("reverse colors before left turn");
            showRBT();

            grand.setRightChild(parent.getLeftChild());
            parent.setLeftChild(grand);

            if(rootTurn.getValue() > grand.getValue()) {
                rootTurn.setLeftChild(parent);
            } else {
                rootTurn.setRightChild(parent);
            }

            System.out.println("left turn");
            showRBT();

            current = rootNode;
            parent = null;
            grand = null;
            rootTurn = null;
        }
    }

    private void rightTurn(boolean insideGrSon) {
        if (rootTurn == null) {
            if (insideGrSon) {
                rootNode.setLeftChild(current);
                parent.setRightChild(current.getLeftChild());
                current.setLeftChild(parent);
                RBNode spareNode = current;
                current = parent;
                parent = spareNode;
                System.out.println("mini left torn");
                showRBT();
            }
            rootNode.setBlack(false);
            parent.setBlack(true);
            System.out.println("reverse colors before right turn");
            showRBT();
            rootNode.setLeftChild(parent.getRightChild());
            parent.setRightChild(rootNode);
            rootNode = parent;
            System.out.println("turn right nearby root");
            showRBT();
        } else {

            if (insideGrSon) {

                parent.setRightChild(current.getLeftChild());
                current.setLeftChild(parent);
                grand.setLeftChild(current);

                RBNode spareNode = parent;
                parent = current;
                current = spareNode;


                System.out.println("mini right torn");
                showRBT();
            }

            grand.setBlack(false);
            parent.setBlack(true);
            System.out.println("reverse colors before left turn");
            showRBT();

            grand.setLeftChild(parent.getRightChild());
            parent.setRightChild(grand);

            if(rootTurn.getValue() > grand.getValue()) {
                rootTurn.setLeftChild(parent);
            } else {
                rootTurn.setRightChild(parent);
            }

            System.out.println("right turn");
            showRBT();

            current = rootNode;
            parent = null;
            grand = null;
            rootTurn = null;

        }
    }

    private void colorChange() {
        if (current.getRightChild() != null && current.getLeftChild() != null &&
            !current.getRightChild().isBlack() && !current.getLeftChild().isBlack()) {
            current.setBlack(false);
            current.getRightChild().setBlack(true);
            current.getLeftChild().setBlack(true);
            System.out.println("change colors R/B " + current.getValue() + " ... " +
                               current.getLeftChild().getValue() + " & " + current.getRightChild().getValue());
            showRBT();
        }
    }

    public void showRBT() {
        array = new RBNode[HOW_MATH_ELEMENTS];
        showHelper(rootNode, 1);
        int counter = 1;
        int oldCounter = 1;
        int upCounter = HOW_MATH_ELEMENTS;
        for (RBNode node : array) {

            for (int i = 0; i < upCounter; i++) {
                System.out.print("  ");
            }
            if (node == null) {
                System.out.print("- ");
            } else {
                System.out.print(node.getValue());
                if (node.isBlack()) {
                    System.out.print("b");
                } else {
                    System.out.print("r");
                }
            }
            for (int i = 0; i < upCounter; i++) {
                System.out.print("  ");
            }


            counter++;
            if (oldCounter * 2 == counter) {
                System.out.println();
                System.out.println();
                oldCounter = counter;
                upCounter = (upCounter - 1) / 2;
            } else {
                System.out.print("  ");
            }
        }
        System.out.println("**********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
    }

    private void showHelper(RBNode parent, int position) {

        if (parent == null) return;

        array[position - 1] = parent;
        showHelper(parent.getLeftChild(), position * 2);
        showHelper(parent.getRightChild(), position * 2 + 1);
    }
}
