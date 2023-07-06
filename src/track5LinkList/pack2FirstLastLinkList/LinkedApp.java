package track5LinkList.pack2FirstLastLinkList;

public class LinkedApp {

    public static void main(String[] args) {
        LinkList linkedArray = new LinkList();

        System.out.println(linkedArray.isEmpty());
        linkedArray.insertRight(8);
        linkedArray.insertRight(9);
        linkedArray.get(0);
        System.out.println(linkedArray.isEmpty());
        linkedArray.remove(0);
        linkedArray.showLinked();
        linkedArray.insertRight(7);
        linkedArray.insertRight(6);
        linkedArray.insertRight(9);

        System.out.println(linkedArray.isEmpty());
        linkedArray.showLinked();

        while(!linkedArray.isEmpty()) {
            linkedArray.remove(0);
        }

        System.out.println(linkedArray.isEmpty());
        linkedArray.showLinked();



    }
}
