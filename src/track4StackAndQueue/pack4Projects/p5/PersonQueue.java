package track4StackAndQueue.pack4Projects.p5;

import java.util.concurrent.atomic.AtomicInteger;

public class PersonQueue extends Thread {

    private Person[] persons;
    private int maxSize;
    private AtomicInteger size = new AtomicInteger();
    private static int queuesNumber;
    private final int queueNumber;

    public PersonQueue(int maxSize) {
        this.maxSize = maxSize;
        persons = new Person[this.maxSize];
        queuesNumber++;
        queueNumber = queuesNumber;
    }

    @Override
    public void run() {
        while (true) {
            if(size.get() > 0) {
                delete();
            }
        }
    }

    public void add(Person person) {
        persons[size.getAndIncrement()] = person;
    }

    public void delete() {

        System.out.println(persons[0].toString() + " start in queue " + queueNumber);
        for (int i = 0; i < persons[0].getSizeBasket(); i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("                  "+persons[0].toString() + " finish in queue " + queueNumber);
        size.decrementAndGet();
        for (int i = 0; i < size.get(); i++) {
            persons[i] = persons[i + 1];
        }
    }

    public int size() {
        return size.get();
    }

    public boolean isEmpty() {
        return size.get() == 0;
    }

    public boolean isFull() {
        return size.get() == maxSize;
    }


}
