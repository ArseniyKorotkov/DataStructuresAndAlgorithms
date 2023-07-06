package track7NotSimpleSorts.pack3QuickSortOfPivotIsMedian;

import java.util.Date;
import java.util.Random;

public class QuickSortMedianApp {

    public static void main(String[] args) {
        long[] arr = new long[1000] /*= {31, 63, 21, 33, 13, 56, 72, 38, 11, 2}*/;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextLong(1000000000);
        }

//        for(long l : arr) {
//            System.out.print(l + ", ");
//        }
        System.out.println();
        QuickSortMedian median = new QuickSortMedian();
        Date date = new Date();
        median.doMedianSort(arr);
        Date date1 = new Date();
        System.out.println(date1.getTime() - date.getTime() + " times");

//        median.selectSorting(arr, 0, arr.length - 1);
//        for(long l : arr) {
//            System.out.print(l + " ");
//        }



        System.out.println();

        boolean goodSystem = true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i - 1] > arr[i]) {
               goodSystem = false;
            }
        }
        System.out.println("is good? " + goodSystem + "!");
    }
}
