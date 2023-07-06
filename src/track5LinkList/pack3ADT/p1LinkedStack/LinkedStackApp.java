package track5LinkList.pack3ADT.p1LinkedStack;
public class LinkedStackApp {

    public static void main(String[] args) {
        LinkedStack linkedStack = new LinkedStack();

        System.out.println(linkedStack.isEmpty());
        linkedStack.insert(8);
        linkedStack.insert(9);
        linkedStack.peek();
        linkedStack.isEmpty();
        linkedStack.pop();
        linkedStack.insert(7);
        linkedStack.insert(6);
        linkedStack.pop();
        System.out.println(linkedStack.isEmpty());

        linkedStack.showLinked();
    }
}
