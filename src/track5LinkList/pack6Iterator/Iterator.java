package track5LinkList.pack6Iterator;


import java.util.NoSuchElementException;

public class Iterator {

    private Link firstLink;
    private final Link nullLink = new Link(-1);
    private Link current;

    public Iterator(Link firstLink) {
        this.firstLink = firstLink;
        reset();
    }

    public void reset() {
        while (firstLink.getPrev() != null) {
            firstLink = firstLink.getPrev();
        }
        nullLink.setNext(this.firstLink);
        current = nullLink;
    }

    public long next() {
        try {
            current = current.getNext();
            long element = current.getElement();
            return element;
        } catch (NullPointerException ex) {
            throw new NoSuchElementException("Iterator Finished");
        }
    }

    public boolean hasNext() {
        return current.getNext() != null;
    }

    public boolean isEnd() {
        return !hasNext();
    }

    public void insertAfter(long element) {
        Link link = new Link(element);
        link.setNext(current.getNext());
        link.setPrev(current);
        current.setNext(link);
        if (link.getNext() != null) {
            link.getNext().setPrev(link);
        }

    }

    public void insertBefore() {
    }

    public void deleteCurrent() {
    }
}
