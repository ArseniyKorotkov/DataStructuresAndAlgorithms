package track8BinaryTrees.pack1BinaryFindTree;

public class BinaryFindTreeApp {

    public static void main(String[] args) {
        BinaryFindTree tree = new BinaryFindTree();
        tree.insert(new Operation("*", 2));
        tree.insert(new Operation("A", 1));
        tree.insert(new Operation("+", 4));
        tree.insert(new Operation("B", 3));
        tree.insert(new Operation("C", 7));
        tree.insert(new Operation("/", 6));
        tree.insert(new Operation("E", 5));
        tree.insert(new Operation("-", 8));
        tree.insert(new Operation("D", 9));

        tree.showThree();

//        System.out.println(tree.getInsideSize());

//        Node[] array = tree.generateArray();
//        System.out.println(array.length);


//        tree.showThreeString(tree.getRootNode());

    }
}
