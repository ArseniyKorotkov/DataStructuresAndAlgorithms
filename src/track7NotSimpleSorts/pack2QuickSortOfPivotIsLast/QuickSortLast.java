package track7NotSimpleSorts.pack2QuickSortOfPivotIsLast;

public class QuickSortLast {

    public long[] doSort(long[] array) {

        array = doPartition(array, -1, array.length - 1, array[(array.length - 1)]);
        return array;
    }

    public long[] doPartition(long[] array, int first, int last, long pivot) {

        if (last - first <= 1) {
            return array;
        }

        int leftScan = first;
        int rightScan = last;
        while (true) {
            while (/*leftScan < last && */array[++leftScan] < pivot) {

            }
            while (rightScan > first + 1 && array[--rightScan] > pivot) {

            }
            if (leftScan >= rightScan) {
                break;
            } else {
                long temp = array[leftScan];
                array[leftScan] = array[rightScan];
                array[rightScan] = temp;
            }

        }
        long temp = array[leftScan];
        array[leftScan] = array[last];
        array[last] = temp;

//        System.out.println("first = " + first);
//        System.out.println("last = " + last);
//        System.out.println("lScan = " + leftScan);
//        System.out.println("rScan = " + rightScan);
//        System.out.println("------");

        array = doPartition(array, first, leftScan - 1, array[leftScan - 1]);
//        System.out.println("++");
        array = doPartition(array, leftScan, last, array[last]);
        return array;
    }
}
