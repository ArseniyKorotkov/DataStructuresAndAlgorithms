package track5LinkList.pack4SortedList;

public class SortedListApp {
    public static void main(String[] args) {

        SortedList sortedList = new SortedList();

        sortedList.add(4);
        sortedList.add(5);
        sortedList.add(3);
        sortedList.add(1);
        sortedList.add(2);
        System.out.println(sortedList.size());
        sortedList.remove(2);
        sortedList.add(0);


        sortedList.showLinked();


    }
}
