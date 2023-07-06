package track5LinkList.pack6Iterator;

public class IteratorApp {

    public static void main(String[] args) {
        DoublyLinked doublyLinked = new DoublyLinked();

        doublyLinked.addLeft(5);
        doublyLinked.addLeft(3);
        doublyLinked.addLeft(2);
        doublyLinked.addLeft(1);
        Iterator iterator = doublyLinked.getIterator();

        iterator.insertAfter(10);
        iterator.insertAfter(9);
        iterator.reset();

//        doublyLinked.addLeft(99);




        while (!iterator.isEnd()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
//        iterator.insertAfter(6);
//        iterator.insertAfter(7);
//        iterator.reset();
//        while (!iterator.isEnd()) {
//            System.out.print(iterator.next() + " ");
//        }
//
//        while (!iterator.isEnd()) {
//            System.out.print(iterator.next() + " ");
//        }


    }
}
