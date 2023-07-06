package track5LinkList.pack7Projects.p4;

public class Link {

    private Link nextLink;
    private final long element;

    public Link(long element) {
        this.element = element;
    }

    public Link getNextLink() {
        return nextLink;
    }

    public long getElement() {
        return element;
    }

    public void setNextLink(Link nextLink) {
        this.nextLink = nextLink;
    }
}
