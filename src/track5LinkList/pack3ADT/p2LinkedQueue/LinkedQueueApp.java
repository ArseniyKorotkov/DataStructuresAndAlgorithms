package track5LinkList.pack3ADT.p2LinkedQueue;

public class LinkedQueueApp {

    public static void main(String[] args) {
        LinkedQueue linkedArray = new LinkedQueue();

        System.out.println(linkedArray.isEmpty());
        linkedArray.insert(8);
        linkedArray.insert(9);
        linkedArray.peek();
        System.out.println(linkedArray.isEmpty());
        linkedArray.pop();
        linkedArray.showLinked();
        linkedArray.insert(7);
        linkedArray.insert(6);
        linkedArray.insert(9);

        System.out.println(linkedArray.isEmpty());
        linkedArray.showLinked();

        while(!linkedArray.isEmpty()) {
            linkedArray.pop();
        }

        System.out.println(linkedArray.isEmpty());
        linkedArray.showLinked();
    }
}
