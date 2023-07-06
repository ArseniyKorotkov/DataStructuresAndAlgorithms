package track6Recursion.pack6MergeSort.pack3RecMergeSort;

public class LinkedQueue {

    private Link firstLink;
    private Link lastLink;
    private int size;

    public void add(long element) {
        Link link = new Link(element);
        if (isEmpty()) {
            lastLink = link;
        } else {
            firstLink.setPrevLink(link);
        }
        firstLink = link;
        size++;
    }

    public long peek() {
        if (isEmpty()) throw new IndexOutOfBoundsException();

        return lastLink.getElement();


    }

    public long pop() {
        if (isEmpty()) throw new IndexOutOfBoundsException();

        long element = lastLink.getElement();
        lastLink = lastLink.getPrevLink();
        size--;
        return element;

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
