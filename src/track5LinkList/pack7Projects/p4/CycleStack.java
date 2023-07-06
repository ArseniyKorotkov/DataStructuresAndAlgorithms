package track5LinkList.pack7Projects.p4;

public class CycleStack {

    SimpleCycleList cycleList = new SimpleCycleList();

    public void add(long element) {
        cycleList.add(element);
    }

    public void pop() {
        cycleList.removeNext();
    }

    public void peek() {
        cycleList.peek();
    }

    public void show() {
        cycleList.showRondo();
    }
}
