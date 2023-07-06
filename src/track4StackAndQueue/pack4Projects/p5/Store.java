package track4StackAndQueue.pack4Projects.p5;

public class Store {

    private volatile PersonQueue[] personQueues = new PersonQueue[3];

    public Store() {
        for (int i = 0; i < personQueues.length; i++) {
            personQueues[i] = new PersonQueue(100);
            personQueues[i].start();
        }
    }

    public void welcome(Person person) {
        personQueues[getIndexMinQueue()].add(person);
    }

    private int getIndexMinQueue() {
        int indexMinQueue = 0;
        for (int i = 0; i < 3; i++) {
            if (personQueues[i].size() < personQueues[indexMinQueue].size()) {
                indexMinQueue = i;
            }
        }
        return indexMinQueue;
    }

    public void showSizes() {
        for (int i = 0; i < 3; i++) {
            System.out.println("+++++++++++++++++++++++++++++" + personQueues[i].size());
        }
    }
}
