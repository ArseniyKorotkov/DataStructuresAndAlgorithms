package track4StackAndQueue.pack2Queue.p1SimpleQueue;

import java.util.NoSuchElementException;

public class QueueApp {

    public static void main(String[] args) {
        QueueX queueX = new QueueX(5);

        queueX.insert(1);
        queueX.insert(2);
        queueX.insert(3);
        queueX.insert(4);
        queueX.insert(5);
        queueX.insert(6);

//        queueX.showArray();

        System.out.println(queueX.pop() + " pop");
        System.out.println(queueX.pop() + " pop");
        queueX.insert(7);
        queueX.insert(8);
        queueX.insert(9);
        queueX.insert(10);

try {
    System.out.println(queueX.pop() + " pop");
    System.out.println(queueX.pop() + " pop");
    System.out.println(queueX.pop() + " pop");
    System.out.println(queueX.pop() + " pop");
    System.out.println(queueX.pop() + " pop");
    System.out.println(queueX.pop() + " pop");
} catch (NoSuchElementException ex) {
    System.out.println("don`t can pop. Is empty = " + queueX.isEmpty());
}

        queueX.insert(9);
        queueX.insert(10);
        queueX.insert(11);
        queueX.insert(12);

        queueX.showArray();

        try {
            System.out.println(queueX.pop() + " pop");
            System.out.println(queueX.pop() + " pop");
            System.out.println(queueX.pop() + " pop");
            System.out.println(queueX.pop() + " pop");
            System.out.println(queueX.pop() + " pop");
            System.out.println(queueX.pop() + " pop");
        } catch (NoSuchElementException ex) {
            System.out.println("don`t can pop. Is empty = " + queueX.isEmpty());

        }

        System.out.println(queueX.isEmpty());
        System.out.println(queueX.isFull());



    }
}
