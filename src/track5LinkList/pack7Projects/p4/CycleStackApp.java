package track5LinkList.pack7Projects.p4;

public class CycleStackApp {

    public static void main(String[] args) {
        CycleStack cycleStack = new CycleStack();

        cycleStack.peek();

        cycleStack.add(7);
        cycleStack.add(6);
        cycleStack.add(5);
        cycleStack.add(4);

        cycleStack.peek();
        cycleStack.show();

        cycleStack.pop();
        cycleStack.pop();
        cycleStack.pop();
        cycleStack.pop();

    }
}
