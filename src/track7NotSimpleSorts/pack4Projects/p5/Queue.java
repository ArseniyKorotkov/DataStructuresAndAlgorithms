package track7NotSimpleSorts.pack4Projects.p5;

public class Queue {

    private Link firstLink;
    private Link lastLink;
    private int size;

    public void insert(long element) {
        Link link = new Link(element);
        if (firstLink == null) {
            firstLink = link;
        } else {
            lastLink.setPrevLink(link);
        }
        lastLink = link;
        size++;
    }

    public long peek() {
        if (!isEmpty())
            return firstLink.getElement();
        else
            throw new IndexOutOfBoundsException();
    }

    public long pop() {
        if (!isEmpty()) {
            long l = firstLink.getElement();
            firstLink = firstLink.getPrevLink();
            size--;
            return l;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void showAllElements() {
        Link showLink = firstLink;
        while (!isEmpty()) {
            System.out.print(showLink.getElement() + " ");
            if (showLink.getPrevLink() == null) {
                break;
            }
            showLink = showLink.getPrevLink();
        }
    }
}
