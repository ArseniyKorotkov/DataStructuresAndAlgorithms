package track7NotSimpleSorts.pack2QuickSortOfPivotIsLast.myVariable;

public class PartitionApp {

    public static void main(String[] args) {
        long[] array = {13, 45, 24, 46, 23, 35, 29, 15};
        Partition partition = new Partition();
        partition.partition(array, 15);
        partition.sort();
        partition.showArr();



    }
}
