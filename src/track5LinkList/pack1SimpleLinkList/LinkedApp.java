package track5LinkList.pack1SimpleLinkList;

public class LinkedApp {

    public static void main(String[] args) {
        LinkList linkedArray = new LinkList();

        System.out.println(linkedArray.isEmpty());
        linkedArray.add(8);
        linkedArray.add(9);
        System.out.println(linkedArray.get(0));
        System.out.println(linkedArray.isEmpty());
        linkedArray.remove(0);
        linkedArray.add(7);
        linkedArray.add(6);
        linkedArray.remove(2);
        System.out.println(linkedArray.isEmpty());

        linkedArray.showLinked();
        int i = 0;
        while (true) {
            linkedArray.add(5);
            i++;
            if(i % 1000 == 0) {
                System.out.println(i);
            }
        }

    }
}
