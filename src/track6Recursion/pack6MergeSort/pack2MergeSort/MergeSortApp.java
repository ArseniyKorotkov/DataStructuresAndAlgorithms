package track6Recursion.pack6MergeSort.pack2MergeSort;

public class MergeSortApp {


    public static void main(String[] args) {
        MergeSort sorter = new MergeSort();
        long[] array = {1, 65, 32, 3, 45, 6, 32, 2, 3, 4};
        array = sorter.mergeSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
