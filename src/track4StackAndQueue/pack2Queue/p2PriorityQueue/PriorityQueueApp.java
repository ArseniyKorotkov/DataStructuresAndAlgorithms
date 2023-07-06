package track4StackAndQueue.pack2Queue.p2PriorityQueue;

public class PriorityQueueApp {
    public static void main(String[] args) {
        PriorityQueueX priorityQueueX = new PriorityQueueX(5);

        priorityQueueX.insert(1);
        priorityQueueX.insert(4);
        priorityQueueX.insert(5);
        priorityQueueX.insert(2);
        priorityQueueX.insert(3);
        priorityQueueX.insert(6);

        System.out.println("pop " + priorityQueueX.pop());
        System.out.println("pop " + priorityQueueX.pop());
        System.out.println("pop " + priorityQueueX.pop());

        priorityQueueX.insert(7);
        priorityQueueX.insert(9);
        priorityQueueX.insert(6);
        priorityQueueX.insert(11);

        System.out.println("pop " + priorityQueueX.pop());

        System.out.println("queue interval = " +priorityQueueX.minPeek() +"-"+ priorityQueueX.peek());


    }
}
