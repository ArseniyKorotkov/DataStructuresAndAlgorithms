package track5LinkList.pack3ADT.p2LinkedQueue;

import track5LinkList.pack2FirstLastLinkList.LinkList;


public class LinkedQueue {

    private final LinkList linkList = new LinkList();

    public void insert(long element) {
        System.out.println("insert " + element);
        linkList.insertRight(element);
    }

    public long peek() {
        System.out.println("peek " + linkList.get(0));
        return linkList.get(0);
    }

    public boolean isHave(long element) {
        return linkList.isHave(element);
    }

    public long pop() {
        System.out.println("pop " + linkList.get(0));
        return linkList.remove(0);
    }

    public boolean isEmpty() {
        return linkList.isEmpty();
    }

    public int size() {
        return linkList.size();
    }

    public void showLinked() {
        linkList.showLinked();
    }
}
