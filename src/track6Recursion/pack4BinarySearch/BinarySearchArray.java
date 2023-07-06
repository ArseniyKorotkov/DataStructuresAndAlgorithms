package track6Recursion.pack4BinarySearch;


public class BinarySearchArray {

    private final long[] array;
    private int maxSize;
    private int size;
    private int spareMiddle;
    private int spareStart;
    private int spareFin;

    public BinarySearchArray(int maxSize) {
        array = new long[maxSize];
    }

    public void recAdd(long element) {
        if (spareStart > spareFin || size == 0) {
            turnRight();
            array[spareStart] = element;
            size++;
            spareStart = 0;
            spareFin = size - 1;
        } else {
            spareMiddle = (spareFin + spareStart) / 2;
            if (array[spareMiddle] < element) {
                spareStart = spareMiddle + 1;
            } else {
                spareFin = spareMiddle - 1;
            }
            recAdd(element);
        }
    }

    private void turnRight() {
        for (int i = size; i > spareStart; i--) {
            array[i] = array[i - 1];
        }
    }


    public int recFindIndexElement(long element) {
        spareMiddle = (spareStart + spareFin) / 2;
        if (array[spareMiddle] == element) {
            spareStart = 0;
            spareFin = size - 1;
            return spareMiddle + 1;
        } else if (element > array[spareMiddle]) {
            spareStart = spareMiddle + 1;
        } else {
            spareFin = spareMiddle - 1;
        }

        if (spareStart > spareFin) {
            return -1;
        }

        return recFindIndexElement(element);
    }

    public void showArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
