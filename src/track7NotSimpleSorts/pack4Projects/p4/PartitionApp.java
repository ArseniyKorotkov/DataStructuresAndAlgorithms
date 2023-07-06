package track7NotSimpleSorts.pack4Projects.p4;

public class PartitionApp {

    public static void main(String[] args) {
        Partition partition = new Partition();
        long[] arr = {22,88,55,77,11, 33, 62,75,85};
        partition.doAskValue(arr, 0, arr.length - 1, 2);
        for(long l : arr) {
            System.out.print(l + " ");
        }

    }
}
