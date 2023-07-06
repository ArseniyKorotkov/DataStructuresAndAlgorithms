package track12Heap.pack2HeapWithTree;

import java.util.Random;

public class HeapApp {

    public static void main(String[] args) {
        Heap pyramid = new Heap();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            pyramid.insert(random.nextLong(100));
        }

        pyramid.showTree();
        pyramid.pop();
        pyramid.doOrder();

        while (!pyramid.isEmpty()) {
            System.out.print(pyramid.pop() + " ");
        }
    }


}
