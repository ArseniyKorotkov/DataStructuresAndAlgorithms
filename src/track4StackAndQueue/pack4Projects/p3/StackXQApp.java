package track4StackAndQueue.pack4Projects.p3;

public class StackXQApp {

    public static void main(String[] args) {
        StackXQ stackXQ = new StackXQ(5);

        stackXQ.insertRight(1);
        stackXQ.insertRight(2);
        stackXQ.insertRight(3);

        stackXQ.removeRight();

        stackXQ.showArray();
        stackXQ.showDeque();

        stackXQ.insertLeft(6);
    }
}
