package track5LinkList.pack4SortedList;

public class ListInsertionSortApp {

    public static void main(String[] args) {
        long[] array = new long[6];
        array[0] = 8;
        array[1] = 5;
        array[2] = 6;
        array[3] = 2;
        array[4] = 0;
        array[5] = 6;

        sortWithSortedList(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    private static void sortWithSortedList(long[] array) {
        SortedList sortedList = new SortedList();

        for (int i = 0; i < array.length; i++) {
            sortedList.add(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = sortedList.remove(0);
        }


    }
}
