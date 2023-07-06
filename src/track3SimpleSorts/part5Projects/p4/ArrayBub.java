package track3SimpleSorts.part5Projects.p4;

public class ArrayBub {

    private final long[] a;
    private int size;

    public ArrayBub(int max) {
        a = new long[max];
    }

    public void evenOddSort() {

        while (true) {
            boolean swapFlag = true;
            for (int i = 0; i < size - 1; i += 2) {
                if (a[i] > a[i + 1]) {
                    swap(i, i + 1);
                    swapFlag = false;
                }
            }
            for (int i = 1; i < size - 1; i += 2) {
                if (a[i] > a[i + 1]) {
                    swap(i, i + 1);
                    swapFlag = false;
                }
            }

            if(swapFlag) {
                break;
            }
        }
    }

    private void swap(int one, int second) {
        long c = a[one];
        a[one] = a[second];
        a[second] = c;
    }

    public void insert(long element) {
        if (size != a.length) {
            a[size] = element;
            size++;
        }
    }

    public boolean find(long element) {
        boolean b = false;
        int s = 0;
        int f = size - 1;
        int curIn;
        while (true) {
            curIn = ((s + f) / 2);
            if (a[curIn] == element) {
                b = true;
                break;
            } else if (element < a[curIn]) {
                f = curIn - 1;
            } else {
                s = curIn + 1;
            }

            if (s > f) {
                break;
            }
        }
        return b;
    }

    public void delete(int index) {
        a[index] = 0;
        for (int i = index; i < size - 1; i++) {
            a[i] = a[i + 1];
        }
        size--;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return size;
    }
}
