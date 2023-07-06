package track7NotSimpleSorts.pack4Projects.p5;

public class NotEqualsSortApp {

    public static void main(String[] args) {
        long[] array = {23, 98,67,44,99,11,444,57929, 848,61, 33, 98};
        NotEqualsSort sort = new NotEqualsSort();
        sort.doSort(array, 10);
        sort.showResult();
    }
}
