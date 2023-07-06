package track7NotSimpleSorts.pack4Projects.p1;

public class PartitionApp {

    public static void main(String[] args) {
        Partition partition = new Partition();
        long[] arr = {22,88,55,77,11, 33, 62,75,85};
        partition.doQuickSort(arr, 0, arr.length - 1);
        for(long l : arr) {
            System.out.print(l + " ");
        }

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
