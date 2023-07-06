package track7NotSimpleSorts.pack1ShellSort;

public class ShellSortApp {

    public static void main(String[] args) {
        long[] array = {34, 5,9, 99, 57,64,3,24,53,7,2,6};
        array = new ShellSort().injectionSort(array);
        for(long i : array) {
            System.out.print(i + " ");
        }
    }
}
