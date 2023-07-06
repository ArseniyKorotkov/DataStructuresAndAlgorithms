package track6Recursion.pack7TriangleSwith;

import java.util.Stack;

public class Triangle {

    public int recursionTriangle(int n) {
        if (n == 1) {
            System.out.println("return 1");
            return 1;
        } else {
            int temp = recursionTriangle(n - 1) + n;
            System.out.println("return " + temp);
            return temp;
        }
    }

    public int switchTriangle(int n) {
        Stack<StackElement> elementStack = new Stack<>();
        int answer = 0;
        int step = 0;
        while (true) {
            switch (step) {
                case 0:
                    elementStack.add(new StackElement(n, true));
                    step = 1;
                    break;
                case 1:
                    if (elementStack.peek().getReturnElement() == 1) {
                        step = 2;
                    } else {
                        elementStack.add(new StackElement(--n, false));
                    }
                    break;
                case 2:
                    if (elementStack.peek().isFirst()) {
                        step = 3;
                    }
                    answer += elementStack.pop().getReturnElement();

                    break;
                case 3:
                    return answer;
            }
        }
    }

//    public int stackTriangle(int n) {
//        return 0;
//    }
}
