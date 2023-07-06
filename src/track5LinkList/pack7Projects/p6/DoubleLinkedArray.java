package track5LinkList.pack7Projects.p6;

public class DoubleLinkedArray {

    private Link firstLink;
    private Link current;
    private Link addedCurrent;
    private Link saveCurrent;

    public void createSlot(int noInColumn, int noInString, long element) {
        if(isEmpty()) {
            firstLink = new Link(0);
        }

        createBufferString(noInColumn, noInString);

        downToStrings(noInColumn);
        Link prevLink = createString(noInString);
        createLink(prevLink, element);
    }

    private void createBufferString(int noInColumn, int noInString) {
        addedCurrent = null;
        downToStrings(noInColumn + 1);
        saveCurrent = current;
        createString(noInString);
        addedCurrent = saveCurrent;
    }

    private void createElementString() {

    }

    private void downToStrings(int stringNo) {
        current = firstLink;
        for (int i = 0; i < stringNo - 1; i++) {
            if(current.getNextLinked() == null) {
                current.setNextLinked(new Link(0));
            }
            current = current.getNextLinked();
        }
        saveCurrent = current;
    }

    private Link createString(int stringLength) {
        Link prevLink = current;
        for (int i = 0; i < stringLength - 1; i++) {
            if(current.getNextLink() == null) {
                current.setNextLink(new Link(0));
                if(addedCurrent != null) {
                    current.setNextLinked(addedCurrent);
                    addedCurrent = addedCurrent.getNextLink();
                }
            }
            prevLink = current;
            current = current.getNextLink();
        }

        return prevLink;
    }

    private void createLink(Link prevLink, long element) {
        Link link = new Link(element);
        prevLink.setNextLink(link);
        link.setNextLink(current.getNextLink());
        link.setNextLinked(current.getNextLinked());
        current = link;
    }

    public void DoubleShow() {
        Link currentString;
        Link currentColumn = firstLink;
        while (currentColumn != null) {

            currentString = currentColumn;
            while(currentString != null) {
                System.out.print(currentString.getElement() + " ");
                currentString = currentString.getNextLink();
            }
            currentColumn = currentColumn.getNextLinked();
            System.out.println();
        }
    }

    public Link current() {
        return current;
    }

    public boolean isEmpty() {
        return firstLink == null;
    }
}
