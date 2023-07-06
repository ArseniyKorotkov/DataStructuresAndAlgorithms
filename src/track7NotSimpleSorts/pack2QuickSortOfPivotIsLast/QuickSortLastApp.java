package track7NotSimpleSorts.pack2QuickSortOfPivotIsLast;


public class QuickSortLastApp {

    public static void main(String[] args) {
        long[] array = {13, 45, 24, 46, 23, 35, 29, 15};
        QuickSortLast quickSort = new QuickSortLast();
        quickSort.doSort(array);

        for(long l : array) {
            System.out.print(l + " ");
        }
    }
}
