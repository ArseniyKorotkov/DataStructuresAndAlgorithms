package track4StackAndQueue.pack4Projects.p4;

public class PriorityQApp {

    public static void main(String[] args) {
        PriorityQ priorityQ = new PriorityQ(5);
        priorityQ.add(5);
        priorityQ.add(6);
        priorityQ.add(1);
        priorityQ.add(4);
        priorityQ.add(2);
        priorityQ.add(3);
        priorityQ.pop();
        priorityQ.pop();
        priorityQ.pop();
        priorityQ.add(3);
        priorityQ.size();

        priorityQ.showQueue();
    }
}
