package track5LinkList.pack7Projects.p3;

public class CycleApp {

    public static void main(String[] args) {
        SimpleCycleList cycleList = new SimpleCycleList();

        cycleList.getSize();
        System.out.println();

        cycleList.next();
        cycleList.removeNext();
        System.out.println();

        cycleList.add(6);
        cycleList.next();
        cycleList.next();
        cycleList.getSize();
        System.out.println();

        cycleList.add(7);
        cycleList.peek();
        cycleList.next();
        cycleList.next();
        cycleList.next();
        cycleList.peek();
        cycleList.getSize();
        System.out.println();

        cycleList.add(5);
        cycleList.add(4);
        cycleList.add(3);

        cycleList.peek();
        cycleList.showRondo();

        cycleList.next();
        cycleList.peek();
        cycleList.showRondo();
        cycleList.showRondo();
        cycleList.peek();

        cycleList.removeNext();
        cycleList.removeNext();
        cycleList.removeNext();
        cycleList.removeNext();
        cycleList.removeNext();
        cycleList.showRondo();
        cycleList.removeNext();

        cycleList.add(3);
        cycleList.add(2);
        cycleList.add(1);

        cycleList.next();

        cycleList.showRondo();

    }
}
