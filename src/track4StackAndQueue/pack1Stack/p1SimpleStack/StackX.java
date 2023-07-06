package track4StackAndQueue.pack1Stack.p1SimpleStack;

public class StackX {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public StackX(int size) {
        maxSize = size;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long value) {
        stackArray[++top] = value;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
