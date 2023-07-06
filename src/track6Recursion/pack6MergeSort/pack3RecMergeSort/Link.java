package track6Recursion.pack6MergeSort.pack3RecMergeSort;

public class Link {

    private Link prevLink;
    private long element;

    public Link(long element) {
        this.element = element;
    }

    public long getElement() {
        return element;
    }

    public Link getPrevLink() {
        return prevLink;
    }

    public void setPrevLink(Link prevLink) {
        this.prevLink = prevLink;
    }
}
