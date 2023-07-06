package track5LinkList.pack4SortedList;


import track5LinkList.pack2FirstLastLinkList.Link;
import track5LinkList.pack2FirstLastLinkList.LinkList;


public class SortedList extends LinkList {

    @Override
    public void insertRight(long element) {
        if(!isEmpty()) {
            Link link = new Link(element);
            lastElement.setNextLink(link);
            lastElement = link;
            size++;
        } else {
            super.add(element);
        }
    }

    @Override
    public void add(long element) {
        Link nextLink = firstElement;
        Link prevLink = null;

//        if (isEmpty() || firstElement.getElement() > element) {
//            super.add(element);
//        } else {

            int i;
            for (i = 0; i < size(); i++) {
                if (nextLink.getElement() > element) {
                    if(i == 0) {
                        super.add(element);
                        break;
                    }
                    Link link = new Link(element);
                    link.setNextLink(nextLink);
                    prevLink.setNextLink(link);
                    size++;
                    break;
                } else {
                    prevLink = nextLink;
                    nextLink = nextLink.getNextLink();
                }
            }
            if (i == size()) {
                /*super.*/insertRight(element);
            }

//        }



    }
}
