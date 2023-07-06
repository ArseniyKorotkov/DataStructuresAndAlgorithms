package track12Heap.pack1HeapWithArray;

import java.util.Random;

public class HeapSortApp {

    public static void main(String[] args) {
        Heap pyramid = new Heap();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            pyramid.add(random.nextLong(20));
        }

        pyramid.showList();
        System.out.println();


        while (!pyramid.isEmpty()) {
            System.out.print(pyramid.pop() + " ");
        }
    }
}
