package track4StackAndQueue.pack4Projects.p2;

public class DequeX {

    private long[] array;
    private int inEl = 0;
    private int outEl = 0;
    private int size;

    public DequeX(int size) {
        this.size = size + 1;
        array = new long[this.size];
    }

    public void insertRight(long element) {
        if (!isFull()) {
            inEl = inEl % size;
            array[inEl++] = element;
            System.out.println("add element " + element);
        } else {
            System.out.println("not add element " + element + ". Array is full.");
        }
    }

    public void insertLeft(long element) {
        if (!isFull()) {
            array[outEl = (outEl - 1 + size) % size] = element;
            System.out.println("add element " + element);
        } else {
            System.out.println("not add element " + element + ". Array is full.");
        }
    }

    public long removeLeft() {
        if (!isEmpty()) {
            outEl = outEl % size;
            System.out.println("remove " + array[outEl]);
            return array[outEl++];
        } else {
            System.out.println("not pop. Array is empty");
            return -99999999;
        }
    }

    public long removeRight() {
        if (!isEmpty()) {
            inEl = --inEl % size;
            System.out.println("remove " + array[inEl]);
            return array[inEl];
        } else {
            System.out.println("not pop. Array is empty");
            return -99999999;
        }
    }

    public boolean isEmpty() {
        return inEl == outEl;
    }

    public boolean isFull() {
        return (outEl - inEl + size) % size == 1;
    }

    public void showArray() {
        System.out.print("Array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public void showDeque() {
        System.out.print("Deque is: ");
        for (int i = 0; i < dequeSize(); i++) {
            System.out.print(array[(outEl + i) % size]);
        }
        System.out.println();
    }

    public int dequeSize() {
        if (inEl > outEl) {
            return inEl - outEl;
        }
        return inEl + (size - outEl);
    }
}








