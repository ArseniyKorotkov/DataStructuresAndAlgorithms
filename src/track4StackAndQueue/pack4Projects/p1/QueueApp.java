package track4StackAndQueue.pack4Projects.p1;

public class QueueApp {

    public static void main(String[] args) {
        QueueX queueX = new QueueX(5);
        queueX.insert(1);
        queueX.insert(2);
        queueX.insert(3);
        queueX.insert(4);
        queueX.insert(5);
        queueX.insert(6);
        queueX.pop();
        queueX.pop();
        queueX.pop();
        queueX.insert(7);
        queueX.insert(8);
        queueX.insert(9);

        queueX.showArray();
        queueX.showQueue();

    }
}
