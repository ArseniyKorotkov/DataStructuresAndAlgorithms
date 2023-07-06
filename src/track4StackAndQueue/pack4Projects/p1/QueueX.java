package track4StackAndQueue.pack4Projects.p1;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class QueueX {

    private final long[] array;
    private int size;
    private int outEl = 0;
    private int inEl = 0;
//    private boolean fullFlag = false;
    private int itemsCounter = 0;

    public QueueX(int size) {
        this.size = size;
        array = new long[this.size];
    }

    public void insert(long index) {
        if (!isFull()) {
            array[inEl] = index;
            itemsCounter++;
            System.out.println("insert" + index);
            if ((outEl - inEl + size) % size == 1) {
//                fullFlag = true;
            }
            inEl = (inEl + 1) % size;
        } else {
            System.out.println("not can add " + index+". queue is full");
        }
    }

//    public void insert(long element) {
//        if (!isFull()) {
//            if (size - finish > 1) {
//                finish++;
//            } else {
//                finish = 0;
//            }
//            if((finish + 1 + size) % size == start) {
//                isFull = true;
//            }
//            array[finish] = element;
////            array[++finish % (size)] = element;
////            finish = finish % size;
//        } else {
//            System.out.println("not can. queue is full");
//        }
//    }

    public long pop() {
        if (!isEmpty()) {
//            fullFlag = false;
            itemsCounter--;
            outEl = outEl % size;
            return array[outEl++];
        } else {
            throw new NoSuchElementException();
        }
    }

    public long peek() {
        return array[outEl];
    }

    public boolean isEmpty() {
//        return outEl == inEl && !fullFlag;
        return itemsCounter == 0;
    }

    public boolean isFull() {
//        return fullFlag;
        return itemsCounter == size;
    }

    public void showArray() {
        Arrays.stream(array).forEach(p -> System.out.print(p + " "));
        System.out.println();
    }

    public void showQueue() {
        for (int i = 0; i < itemsCounter; i++) {
            System.out.print(array[(inEl + i) % size] + " ");
        }
        System.out.println();
    }

    public int size() {
        return itemsCounter;
    }

}
