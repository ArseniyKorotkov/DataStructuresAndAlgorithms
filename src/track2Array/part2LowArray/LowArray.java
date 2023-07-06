package track2Array.part2LowArray;

public class LowArray {

    private long[] a;

    public LowArray(int size) {
        this.a = new long[size];
    }

    public void setElem(int index, long element) {
        a[index] = element;
    }

    public long getElem(int index) {
        return a[index];
    }
}
