package track2Array.part6PProjects.p1_3;

public class HighArray {

    private final long[] a;
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

    public long getMax() {
        long max = -1;
        for (int i = 0; i < size; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public void removeMax() {
        delete(getMax());
    }


    public boolean find(long element) {
        return getIndex(element) != size;
    }

    private int getIndex(long element) {
        int i;
        for (i = 0; i < size; i++) {
            if (a[i] == element) {
                break;
            }
        }
        return i;
    }

    public void delete(long element) {
        int index = getIndex(element);
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
