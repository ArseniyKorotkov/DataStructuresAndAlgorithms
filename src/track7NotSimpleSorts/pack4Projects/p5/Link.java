package track7NotSimpleSorts.pack4Projects.p5;

public class Link {

    private Link prevLink;
    private long element;


    public Link(long element) {
        this.element = element;
    }

    public Link getPrevLink() {
        return prevLink;
    }

    public void setPrevLink(Link prevLink) {
        this.prevLink = prevLink;
    }

    public long getElement() {
        return element;
    }
}
