package track4StackAndQueue.pack4Projects.p4;

import java.util.NoSuchElementException;

public class PriorityQ {

    private final long[] array;
    private final int maxSize;
    private int size;

    public PriorityQ(int maxSize) {
        this.maxSize = maxSize;
        array = new long[this.maxSize];
    }

    public void add(long element) {
        if (!isFull()) {
            array[size++] = element;
            System.out.println("add element " + element);
        } else {
            System.out.println("Not add element " + element + ".Queue is full");
        }
    }

    public long peek() {
        System.out.println("peek element " + array[askMinIndex()]);
        return array[askMinIndex()];
    }

    public long pop() {
        if (!isEmpty()) {
            int minElementIndex = askMinIndex();
            long minElement = array[minElementIndex];
            System.out.println("pop element " + minElement);
            size--;
            for (int i = minElementIndex; i < size; i++) {
                array[i] = array[i + 1];
            }
            return minElement;
        }
        System.out.println("Not pop. Is Empty");
        throw new NoSuchElementException();
    }

    private int askMinIndex() {
        int minElementIndex = 0;
        long min = array[minElementIndex];
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                minElementIndex = i;
                min = array[minElementIndex];
            }
        }
        return minElementIndex;
    }

    public void showQueue() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public void size() {
        System.out.println("size is " + size);
    }
}
