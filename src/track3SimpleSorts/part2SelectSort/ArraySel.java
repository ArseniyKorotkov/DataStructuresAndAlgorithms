package track3SimpleSorts.part2SelectSort;

public class ArraySel {

    private final long[] a;
    private int size;

    public ArraySel(int max) {
        a = new long[max];
    }

    public void selectionSort() {
        int max;
        for (int n = 0; n < size ; n++) {

           max = 0;
            for (int i = 1; i < size - n; i++) {
                if(a[i] > a[max]) {
                    max = i;
                }
            }
            swap(size - n - 1, max);
        }

//        int out, in, min;
//        for (out = 0; out < size - 1; out++) // Внешний цикл
//        {
//            min = out; // Минимум
//            for (in = out + 1; in < size; in++) // Внутренний цикл
//                if (a[in] < a[min]) // Если значение min больше,
//                    min = in; // значит, найден новый минимум
//            swap(out, min); // swap them
//        }
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
