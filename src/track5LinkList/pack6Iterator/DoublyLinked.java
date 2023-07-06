package track5LinkList.pack6Iterator;

public class DoublyLinked {

    private Link firstLink;
    private Link lastLink;
    private int size;

    public Iterator getIterator() {
        return new Iterator(firstLink);
    }

    public void addLeft(long element) {
        Link link = new Link(element);
        if (isEmpty()) {
            lastLink = link;
        } else {
            firstLink.setPrev(link);
            link.setNext(firstLink);
        }
        firstLink = link;
        size++;
    }

    public void addRight(long element) {
        Link link = new Link(element);
        if (isEmpty()) {
            firstLink = link;
        } else {
            link.setPrev(lastLink);
            lastLink.setNext(link);
        }
        lastLink = link;
        size++;
    }

    public void addAfter(long after, long element) {
        Link link = new Link(element);
        Link current = firstLink;
        boolean flag = false;

        while (current != null) {
            if (current.getElement() == after) {
                if (current == lastLink) {
                    addRight(element);
                    flag = false;
                    break;
                }
                link.setNext(current.getNext());
                link.setPrev(current);
                link.getNext().setPrev(link);
                link.getPrev().setNext(link);
                flag = false;
                break;
            } else {
                current = current.getNext();
                flag = true;
            }
        }

        if (flag) {
            addLeft(element);
        }

    }

    public void remove(long element) {
        Link link = firstLink;
        while (link != null) {
            if(link.getElement() == element) {
                if(link == firstLink) {
                    removeFirst();
                } else if(link == lastLink) {
                    removeLast();
                } else {
                    link.getPrev().setNext(link.getNext());
                    link.getNext().setPrev(link.getPrev());
                }
                break;
            } else {
                link = link.getNext();
            }
        }
    }

    public void removeLast() {
        if (!isEmpty()) {
            lastLink = lastLink.getPrev();
            lastLink.setNext(null);
            size--;
        }
    }

    public void removeFirst() {
        if(!isEmpty()) {
            firstLink = firstLink.getNext();
            firstLink.setPrev(null);
            size--;
        }
    }

    public void showList() {
        Link link = firstLink;
        while (link != null) {
            System.out.print(link.getElement() + " ");
            link = link.getNext();
        }
        System.out.println();
    }

    public void showListReverse() {
        Link link = lastLink;
        while (link != null) {
            System.out.print(link.getElement() + " ");
            link = link.getPrev();
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
