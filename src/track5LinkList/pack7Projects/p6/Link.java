package track5LinkList.pack7Projects.p6;

public class Link {

    private Link nextLink;
    private Link nextLinked;
    private final long element;

    public Link(long element) {
        this.element = element;
    }

    public Link getNextLink() {
        return nextLink;
    }

    public Link getNextLinked() {
        return nextLinked;
    }

    public long getElement() {
        return element;
    }

    public void setNextLink(Link nextLink) {
        this.nextLink = nextLink;
    }
    public void setNextLinked(Link nextLinked) {
        this.nextLinked = nextLinked;
    }
}
