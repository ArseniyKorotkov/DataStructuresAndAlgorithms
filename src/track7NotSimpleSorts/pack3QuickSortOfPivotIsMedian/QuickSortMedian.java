package track7NotSimpleSorts.pack3QuickSortOfPivotIsMedian;

public class QuickSortMedian {

    private int copy;
    private int equals;


    public long[] doMedianSort(long[] array) {
        medianSorting(array, 0, array.length - 1);
        System.out.println("copy = " + copy);
        System.out.println("equals = " + equals);
        return array;
    }


    private void medianSorting(long[] array, int start, int fin) {

        equals++;
        if (fin - start <= 3) {
            array = selectSorting(array, start, fin);
            return;
        }
        copy++;
        int leftScan = start - 1;
        copy++;
        int rightScan = fin + 1;
        copy++;
        int medianScan = (start + fin) / 2;

        long[] peeks = {array[start], array[fin], array[medianScan]};
        peeks = selectSorting(peeks, 0, peeks.length - 1);

        copy++;
        array[start] = peeks[0];
        copy++;
        array[medianScan] = peeks[1];
        copy++;
        array[fin] = peeks[2];
        copy++;
        long pivot = array[medianScan];

        while (true) {

            while (array[++leftScan] < pivot) {
                equals++;
            }
            equals++;
            while (rightScan > start && array[--rightScan] > pivot) {
                equals++;
            }
            equals++;

            equals++;
            if (leftScan >= rightScan) {
                break;
            } else {
                swap(array, leftScan, rightScan);
            }

        }

        medianSorting(array, start, leftScan - 1);
        medianSorting(array, leftScan, fin);


    }

    public long[] selectSorting(long[] array, int start, int fin) {

        long temp;
        for (int i = start + 1; i <= fin; i++) {
            equals++;
            copy++;
            temp = array[i];
            int j;
            for (j = i; j > 0; j--) {
                if (array[j - 1] < temp) break;
                equals++;
            }
            equals++;

            for (int k = i; k > j; k--) {
                array[k] = array[k - 1];
                equals++;
            }
            equals++;
            copy++;
            array[j] = temp;

        }
        return array;
    }


    private void swap(long[] array, int a, int b) {
        copy++;
        long temp = array[a];
        copy++;
        array[a] = array[b];
        copy++;
        array[b] = temp;
    }
}
