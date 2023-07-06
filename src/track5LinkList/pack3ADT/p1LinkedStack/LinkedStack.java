package track5LinkList.pack3ADT.p1LinkedStack;

import track5LinkList.pack1SimpleLinkList.LinkList;


public class LinkedStack {

    private LinkList linkList = new LinkList();

    public void insert(long element) {
        System.out.println("insert " + element);
        linkList.add(element);
    }

    public long peek() {
        System.out.println("peek " + linkList.get(0));
        return linkList.get(0);
    }

    public long pop() {
        System.out.println("pop " + linkList.get(0));
        return linkList.remove(0);
    }

    public void showLinked() {
        linkList.showLinked();
    }

    public boolean isEmpty() {
        return linkList.isEmpty();
    }

    public int size() {
        return linkList.size();
    }
}
