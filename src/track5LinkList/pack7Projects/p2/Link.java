package track5LinkList.pack7Projects.p2;

public class Link {

    private Link next;
    private Link prev;
    private long element;

    public Link(long element) {
        this.element = element;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public Link getPrev() {
        return prev;
    }

    public void setPrev(Link prev) {
        this.prev = prev;
    }

    public long getElement() {
        return element;
    }
}
