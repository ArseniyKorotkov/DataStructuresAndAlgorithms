package track4StackAndQueue.pack3MathAlgorithm;

public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void insert(char value) {
        stackArray[++top] = value;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void showArray() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}
