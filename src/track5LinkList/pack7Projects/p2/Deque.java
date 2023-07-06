package track5LinkList.pack7Projects.p2;

public class Deque {

    private DoublyLinked doublyLinked = new DoublyLinked();

    public void pushStart(long element) {
        doublyLinked.addLeft(element);
    }
    public void pushFin(long element) {
        doublyLinked.addRight(element);
    }

    public long popStart() {
        return doublyLinked.removeFirst();
    }
    public long popFin() {
        return doublyLinked.removeLast();
    }

    public long peekStart() {
        return doublyLinked.showFirst();
    }

    public long peekFin() {
        return doublyLinked.showLast();
    }





}
