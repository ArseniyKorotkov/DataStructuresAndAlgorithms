package track7NotSimpleSorts.pack2QuickSortOfPivotIsLast.partition;


public class PartitionApp {
    public static void main(String[] args) {
//        long[] array = {13, 45, 24, 46, 23, 35, 29, 15};
        long[] array = {22,88,55,77,11, 33};
        Partition.doPartition(array, -1, array.length, 55);

        for(long l : array) {
            System.out.print(l + " ");
        }
    }



}
