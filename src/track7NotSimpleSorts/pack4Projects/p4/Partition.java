package track7NotSimpleSorts.pack4Projects.p4;

import javax.swing.*;

public class Partition {

    private long[] arr;

    public void doAskValue(long[] array, int start, int fin, int position) {

        arr = array;

        if (fin - start <= 0 || position < 1 || position > array.length) {
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

        if(leftScan == position - 1) {
            System.out.println("Position "+ position +" value is " + array[position - 1]);
            return;
        }

        doAskValue(array, start, leftScan - 1, position);
        doAskValue(array, leftScan + 1, fin, position);
    }

    private void swap(int a, int b) {
        long temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
