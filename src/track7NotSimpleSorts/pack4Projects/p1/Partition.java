package track7NotSimpleSorts.pack4Projects.p1;

public class Partition {

    private long[] arr;

    public void doQuickSort(long[] array, int start, int fin) {

        arr = array;

        if (fin - start <= 0) {
            return;
        }


        int leftScan = start - 1;
        int rightScan = fin;
        long pivot = array[fin];
        while (true) {
            while (array[++leftScan] < pivot) ;
            while (rightScan > start && array[--rightScan] > pivot) ;

            if (rightScan - leftScan < 1) {
                break;
            } else {
                swap(rightScan, leftScan);
            }
        }

        swap(leftScan, fin);

        doQuickSort(array, start, leftScan - 1);
        doQuickSort(array, leftScan + 1, fin);
    }

    private void swap(int a, int b) {
        long temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
