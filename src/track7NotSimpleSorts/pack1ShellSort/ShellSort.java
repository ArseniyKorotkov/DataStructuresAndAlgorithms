package track7NotSimpleSorts.pack1ShellSort;

public class ShellSort {

    public long[] injectionSort(long[] array) {
        shellSort(array);
        return array;
    }

    public long[] shellSort(long[] array) {
        int h = 1;
        while (h < (array.length / 3)) {
            h = 3 * h + 1;
        }


        if (array.length > 1) {
            while (h > 0) {
                for (int i = h; i < array.length; i++) {
                    long spare = array[i];
                    int j;
                    for (j = i; j > h - 1; j -= h) {
                        if (spare < array[j - h]) {
                            array[j] = array[j - h];
                        } else {
                            break;
                        }
                    }
                    array[j] = spare;
                }
                h = (h - 1) / 3;

            }
        }
        return array;
    }
}
