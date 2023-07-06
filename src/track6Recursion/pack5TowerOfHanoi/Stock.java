package track6Recursion.pack5TowerOfHanoi;

public class Stock {

    private static final int MAX_SIZE = 8;
    private final int[] stock = new int[MAX_SIZE];
    private int size;

    public void add(int element) {
        if (size < MAX_SIZE) {
            stock[size++] = element;
        }
    }

    public int pop() {

        if (size != 0) {
            int element = stock[--size];
            for (int i = size; i < MAX_SIZE; i++) {
                stock[i] = 0;
            }
            return element;
        } else {
            throw new NegativeArraySizeException();
        }
    }

    public int peek() {
        return isEmpty() ?
                99
                :
                stock[size - 1];
    }

    public int getAllStockElement(int index) {
        if (index >= 0 || index < MAX_SIZE) {
            return stock[index];
        } else {

            throw new IndexOutOfBoundsException();
        }
    }

    public void showStock() {
        for (int i = 0; i < size; i++) {
            System.out.print(stock[i] + " ");
        }
        System.out.println();
    }

    public void showAllStock() {
        for (int i = 0; i < MAX_SIZE; i++) {
            System.out.print(stock[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return size;
    }

    public static int maxSize() {
        return MAX_SIZE;
    }

    public boolean isEmpty() {
        return size == 0;
    }


}
