package track5LinkList.pack2FirstLastLinkList;

public class Link {

    private Link nextLink;
    private long element;

    public Link(long element) {
        this.element = element;
    }

    public void setNextLink(Link nextLink) {
        this.nextLink = nextLink;
    }

    public Link getNextLink() {
        return nextLink;
    }

    public long getElement() {
        return element;
    }

    public void setElement(long element) {
        this.element = element;
    }

    public void displayLink() {
        System.out.println(element);
    }
}
