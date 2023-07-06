package track4StackAndQueue.pack1Stack.p1SimpleStack;

public class SimpleStackApp {

    public static void main(String[] args) {
        StackX stackX = new StackX(100);

        stackX.push(11);
        stackX.push(22);
        stackX.push(33);
        stackX.push(44);

        while (!stackX.isEmpty()) {
            System.out.println(stackX.pop());
        }
    }
}
