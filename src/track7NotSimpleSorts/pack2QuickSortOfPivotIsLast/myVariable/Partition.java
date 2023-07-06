package track7NotSimpleSorts.pack2QuickSortOfPivotIsLast.myVariable;

public class Partition {

    private long[] arr;
    private long part;

    public long[] sort() {
        sorting(arr);
        return arr;
    }

    private void sorting(long[] array) {

        long partition = array[0];
        partition(array, partition);
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == partition) {
                break;
            }
        }
        System.out.println(i);


        long[] a = new long[i - 1];
        long[] b = new long[array.length - i];
        for (int j = 0; j < array.length; j++) {
            if (j < i) {
                a[j] = array[j];
            } else if (j > i) {
                b[j] = array[j];
            }
        }
        if (a.length != 1 && b.length != 1) {
            sorting(a);
            sorting(b);
        }


    }

    public long[] partition(long[] array, long partition) {
        this.part = partition;
        this.arr = array;

        changeStart();


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < partition) {
                change(i);
            }
        }

        return arr;
    }

    private void changeStart() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == part) {
                change(i);
            }
        }
    }

    private void change(int index) {
        long temp = arr[index];
        for (int i = index; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;
    }

    public void showArr() {
        for (long l : arr) {
            System.out.print(l + " ");
        }
        System.out.println();
    }
}
