package track2Array.part6PProjects.p6;

import java.util.HashSet;

public class HighArray {

    private long[] a;
    private int size;

    public HighArray(int max) {
        a = new long[max];
    }

    public void insert(long element) {
        if(size != a.length) {
            a[size] = element;
            size++;
        }
    }


    public boolean find(long element) {
        int i;
        for (i = 0; i < size; i++) {
            if (a[i] == element) {
                break;
            }
        }
        return i != size;
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

    public void noDup() {
        HashSet<Long> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        a = new long[set.size()];
        size = 0;
        for(Long l : set) {
            insert(l);
        }
    }

    public int size() {
        return size;
    }
}
