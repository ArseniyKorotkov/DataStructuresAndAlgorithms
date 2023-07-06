package track9RBTree;

public class RBTreeApp {

    public static void main(String[] args) {
        RBTree tree = new RBTree();

//        addNotRandom(tree);

        addRandom(tree);







    }

    private static void addNotRandom(RBTree tree) {
        for (int i = 0; i < 45; i++) {
            tree.insert(i);
        }
    }

    private static void addRandom(RBTree tree) {
        tree.insert(26);
        tree.insert(17);
        tree.insert(33);
        tree.insert(7);
        tree.insert(28);
        tree.insert(29);
        tree.insert(40);
        tree.insert(39);
        tree.insert(25);
        tree.insert(12);
        tree.insert(23);
        tree.insert(31);
        tree.insert(41);
        tree.insert(32);
        tree.insert(18);
        tree.insert(21);
        tree.insert(27);
        tree.insert(34);
        tree.insert(38);
        tree.insert(30);
        tree.insert(37);
        tree.insert(42);
        tree.insert(9);
        tree.insert(20);
        tree.insert(0);
        tree.insert(8);
        tree.insert(24);
        tree.insert(15);
        tree.insert(3);
        tree.insert(11);
        tree.insert(10);
        tree.insert(44);
        tree.insert(35);
        tree.insert(36);
        tree.insert(19);
        tree.insert(1);
        tree.insert(2);
        tree.insert(5);
        tree.insert(6);
        tree.insert(13);
        tree.insert(45);
        tree.insert(14);
        tree.insert(16);
        tree.insert(22);
        tree.insert(4);
        tree.insert(43);
    }
}
