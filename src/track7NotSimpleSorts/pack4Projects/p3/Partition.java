package track7NotSimpleSorts.pack4Projects.p3;

public class Partition {

    private long[] arr;

    public void doAskMidValue(long[] array, int start, int fin) {

        arr = array;

        if (fin - start <= 0) {
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

        if(leftScan == (array.length) / 2) {
            System.out.println("Middle is " + array[leftScan]);
            return;
        }

        doAskMidValue(array, start, leftScan - 1);
        doAskMidValue(array, leftScan + 1, fin);
    }

    private void swap(int a, int b) {
        long temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
