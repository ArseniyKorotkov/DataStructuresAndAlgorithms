package track6Recursion.pack4BinarySearch;

public class BinarySearchApp {

    public static void main(String[] args) {
        BinarySearchArray binarySearchArray = new BinarySearchArray(100);

        binarySearchArray.recAdd(7);
        binarySearchArray.recAdd(8);
        binarySearchArray.recAdd(5);
        binarySearchArray.recAdd(9);

        binarySearchArray.showArray();

        System.out.println("Index 7 = " + binarySearchArray.recFindIndexElement(7));
        System.out.println("Index 8 = " + binarySearchArray.recFindIndexElement(8));
        System.out.println("Index 5 = " + binarySearchArray.recFindIndexElement(5));
        System.out.println("Index 9 = " + binarySearchArray.recFindIndexElement(9));
    }



}
