package track7NotSimpleSorts.pack2QuickSortOfPivotIsLast.partition;

public class Partition {

    public static void doPartition(long[] array, int first, int last, long pivot) {

        int leftScan = first;
        int rightScan = last;
        while (true) {
            while (leftScan < last - 1 && array[++leftScan] < pivot) {

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
        System.out.println("ri" + rightScan + " le" + leftScan);

    }
}
