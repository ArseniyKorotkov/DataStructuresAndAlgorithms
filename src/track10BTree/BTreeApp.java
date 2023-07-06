package track10BTree;


import java.util.Random;

public class BTreeApp {

    public static void main(String[] args) {
        boolean youWantSee234Tree = false;

        Random random = new Random();
        if (youWantSee234Tree) {
            BTree tree = new BTree();
            for (int i = 0; i < 7000; i++) {
//                tree.insert(random.nextLong(1000));
                tree.insert(5);
            }
            tree.showTree();
            System.out.println();
        } else {

            BTree treeB = new BTree(6);

            for (int i = 0; i < 7000; i++) {
//                treeB.insert(random.nextLong(1000));
                treeB.insert(5);
            }
//            treeB.insert(6);
//            treeB.insert(4);
//            treeB.insert(3);
//            treeB.insert(7);
//            treeB.insert(8);
//            treeB.insert(5);
//            treeB.insert(14);
//            treeB.insert(153);
//            treeB.insert(12);
//            treeB.insert(18);
//            treeB.insert(11);
//            treeB.insert(13);
//            treeB.insert(15);
//            treeB.insert(16);
//            treeB.insert(20);
//            treeB.insert(21);
//            treeB.insert(25);
//            treeB.insert(22);
//            treeB.insert(24);
//            treeB.insert(23);
            treeB.showTree();
            System.out.println();
            System.out.println(treeB.minValue());
        }


    }
}
