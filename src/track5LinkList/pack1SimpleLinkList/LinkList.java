package track5LinkList.pack1SimpleLinkList;

import java.util.NoSuchElementException;

public class LinkList {

    protected Link firstElement;
    private int size;

    public void add(long element) {
        Link link = new Link(element);
        link.setNextLink(firstElement);
        firstElement = link;
        size++;
    }

    public long get(int index) {
        if (!isEmpty() && index < size) {
            Link returnLink = firstElement;
            for (int i = 0; i < index; i++) {
                returnLink = returnLink.getNextLink();
            }
            return returnLink.getElement();
        }
        throw new NoSuchElementException("Don`t have is index");
    }

    private boolean isHave(long element) {
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
        if (!isEmpty() && index < size) {
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

            return returnElement;
        }
        throw new NoSuchElementException("Don`t have is index");
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
