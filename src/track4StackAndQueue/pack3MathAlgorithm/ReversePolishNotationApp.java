package track4StackAndQueue.pack3MathAlgorithm;


public class ReversePolishNotationApp {

    public static void main(String[] args) {

        changeToRPN("A+B–C");
        changeToRPN("A*B/C");
        changeToRPN("A+B*C");
        changeToRPN("A*B+C");
        changeToRPN("A*(B+C)");
        changeToRPN("A*B+C*D");
        changeToRPN("(A+B)*(C–D)");
        changeToRPN("((A+B)*C)–D");
        changeToRPN("A+B*(C–D/(E+F))");

    }

    public static void changeToRPN(String task) {

        StackX items = new StackX(100);
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < task.length(); i++) {
            char ch = task.charAt(i);
            if (ch != '(' && ch != ')' &&
                ch != '+' && ch != '-' && ch != '–' &&
                ch != '*' && ch != '/') {
                answer.append(ch);
            } else {

                if (items.isEmpty() || ch == '(') {
                    items.insert(ch);

                } else if (ch == '+' || ch == '-' || ch == '–') {

                    if (items.peek() == '+' || items.peek() == '/' ||
                        items.peek() == '-' || items.peek() == '*') {
                        answer.append(items.pop());
                    }
                    items.insert(ch);

                } else if (ch == '*' || ch == '/') {

                    if (items.peek() == '*' || items.peek() == '/') {
                        answer.append(items.pop());
                    }
                    items.insert(ch);

                } else /*if (ch == ')')*/ {

                    while (items.peek() != '(') {
                        answer.append(items.pop());
                    }
                    items.pop();

                }
//                items.showArray();
            }
        }

        while (!items.isEmpty()) {
            answer.append(items.pop());
        }

        System.out.println(answer);
    }
}
