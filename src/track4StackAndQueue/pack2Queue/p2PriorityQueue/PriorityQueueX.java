package track4StackAndQueue.pack2Queue.p2PriorityQueue;


import java.util.Arrays;

public class PriorityQueueX {

    private int maxSize;
    private long[] array;
    private int inEl = 0;

    public PriorityQueueX(int maxSize) {
        this.maxSize = maxSize;
        array = new long[this.maxSize];
    }

    public void insert(long element) {
        if (!isFull()) {
            array[inEl++] = element;
            for (int i = 0; i < inEl; i++) {
                for (int j = 1; j < inEl; j++) {
                    if (array[j - 1] > array[j]) {
                        long c = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = c;
                    }
                }
            }
            System.out.print("add " + element + "  ");
            Arrays.stream(array).forEach(System.out::print);
            System.out.println();
        } else {
            System.out.println("max");
        }
    }

    public long pop() {
        if (!isEmpty()) {
            return array[--inEl];
        } else {
//            throw new NoSuchElementException();
            return -999999999;
        }
    }

    public long peek() {
        return array[inEl];
    }

    public long minPeek() {
        return array[0];
    }

    public boolean isEmpty() {
        return size() == 0;
    }
    public boolean isFull() {
        return size() == maxSize;
    }

    public int size() {
        return inEl;
    }
}
