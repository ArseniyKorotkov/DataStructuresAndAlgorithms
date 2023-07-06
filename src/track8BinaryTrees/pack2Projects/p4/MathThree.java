package track8BinaryTrees.pack2Projects.p4;

import java.util.LinkedList;
import java.util.List;

public class MathThree {

    private final LinkedList<Node> nodes = new LinkedList<>();
    private final List<Character> mathSymbols = List.of('+', '-', '*', '/');

    public void insert(String math) {

        for (int i = 0; i < math.length(); i++) {
            nodes.add(new Node(math.charAt(i)));
        }

        int current = 0;
        while (nodes.size() > 2) {
            if (mathSymbols.contains(nodes.get(current).getValue())) {
                nodes.get(current).setRightChild(nodes.remove(current - 1));
                current--;
                nodes.get(current).setLeftChild(nodes.remove(current - 1));
            } else {
                current++;
            }
        }
    }

    public Node getRootNode() {
        return nodes.get(0);
    }

    public void showThree() {
        showHelper(getRootNode());
    }

    private void showHelper(Node parent) {
        if (parent == null) return;
        if((parent.getValue() == '+' || parent.getValue() == '-' /*|| parent.getValue() == '*' || parent.getValue() == '/'*/) &&
           parent != getRootNode()) {
            System.out.print('(');
        }
        showHelper(parent.getLeftChild());

        System.out.print(parent.getValue());
        showHelper(parent.getRightChild());
        if((parent.getValue() == '+' || parent.getValue() == '-' /*|| parent.getValue() == '*' || parent.getValue() == '/'*/) &&
           parent != getRootNode()) {
            System.out.print(')');
        }
    }

}
