package track4StackAndQueue.pack1Stack.p3BracketChecker;

public class StackX {
    private int maxSize;
    private char[] stack;
    private int top;

    public StackX(int size) {
        maxSize = size;
        stack = new char[maxSize];
        top = -1;
    }

    public void push(char value) {
        stack[++top] = value;
    }

    public char pop() {
        return stack[top--];
    }

    public char peek() {
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
