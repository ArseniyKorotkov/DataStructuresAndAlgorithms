package track5LinkList.pack7Projects.p3;

public class SimpleCycleList {

    private Link current;
    private int size;

    public void add(long element) {
        System.out.println("add " + element);
        Link link = new Link(element);
        if (isEmpty()) {
            link.setNextLink(link);
            current = link;
        } else {
            link.setNextLink(current.getNextLink());
            current.setNextLink(link);
        }
        size++;
    }

    public void next() {
        if (!isEmpty()) {
            current = current.getNextLink();
            System.out.println("step to " + current.getElement());
        } else {
            System.out.println("Non next. List is empty");
        }
    }

    public void peek() {
        if (!isEmpty())
            System.out.println("peek is " + current.getElement());
        else
            System.out.println("Non peek. List is empty");

    }

    public void removeNext() {
        if (!isEmpty()) {
            if (size == 1) {
                System.out.println("Remove last element " + current.getElement());
                current = null;
            } else {
                System.out.println("Remove element " + current.getNextLink().getElement());
                current.setNextLink(current.getNextLink().getNextLink());
            }
            size--;
        } else {
            System.out.println("Non remove. List is empty");
        }

    }

    public void showRondo() {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                System.out.print(current.getElement() + " ");
                current = current.getNextLink();
            }
            System.out.println();
        } else {
            System.out.println("Non show rondo. List is empty");
        }
    }

    public int getSize() {
        System.out.println("Size is " + size);
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
