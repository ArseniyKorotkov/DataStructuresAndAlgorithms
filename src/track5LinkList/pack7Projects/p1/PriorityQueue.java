package track5LinkList.pack7Projects.p1;

public class PriorityQueue {

    private SortedList sortedList = new SortedList();


    public void push(long element) {
        sortedList.add(element);
    }

    public long peek() {
        return sortedList.get(0);
    }

    public long pop() {
        return sortedList.remove(0);
    }

    public void showList() {
        sortedList.showLinked();
    }
}
