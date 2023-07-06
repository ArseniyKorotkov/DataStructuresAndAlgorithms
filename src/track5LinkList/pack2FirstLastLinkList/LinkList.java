package track5LinkList.pack2FirstLastLinkList;

import java.util.NoSuchElementException;

public class LinkList {

    protected Link firstElement;
    protected Link lastElement;
    protected int size;



    public void insertRight(long element) {
        if(!isEmpty()) {
            Link link = new Link(element);
            lastElement.setNextLink(link);
            lastElement = link;
            size++;
        } else {
            add(element);
        }
    }

    protected void add(long element) {
        Link link = new Link(element);
        link.setNextLink(firstElement);
        firstElement = link;
        if(isEmpty()) {
            lastElement = firstElement;
        }
        size++;
    }

    public long get(int index) {
        if (!isEmpty()) {
            Link returnLink = firstElement;
            for (int i = 0; i < index; i++) {
                returnLink = returnLink.getNextLink();
            }
            return returnLink.getElement();
        }
        throw new NoSuchElementException();
    }

    public boolean isHave(long element) {
        try {
            Link current = firstElement;
            while (current.getElement() != element) {
                current = firstElement.getNextLink();
            }
            return true;
        } catch (NullPointerException ex) {
            return false;
        }
    }

    public long remove(int index) {
        if (!isEmpty()) {
            Link previousLink = null;
            Link deleteLink = firstElement;

            for (int i = 0; i < index; i++) {
                previousLink = deleteLink;
                deleteLink = deleteLink.getNextLink();

            }
            size--;
            long returnElement = deleteLink.getElement();
            if (previousLink == null) {
                firstElement = firstElement.getNextLink();
            } else {
                previousLink.setNextLink(deleteLink.getNextLink());
            }

            if(deleteLink == lastElement) {
                if(isEmpty()) {
                    lastElement = null;
                } else {
                    lastElement = deleteLink.getNextLink();
                }
            }

            return returnElement;
        }
        throw new NoSuchElementException();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void showLinked() {
        Link current = firstElement;
        while (current != null) {
            System.out.print(current.getElement() + " ");
            current = current.getNextLink();
        }
        System.out.println();
    }


}
