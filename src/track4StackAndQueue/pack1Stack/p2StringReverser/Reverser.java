package track4StackAndQueue.pack1Stack.p2StringReverser;


public class Reverser {

    private String message;
    private StackX stack;

    public String goRev(String message) {
        StringBuilder answer = new StringBuilder();
        this.message = message;
        stack = new StackX(message.length());

        char[] ch = message.toCharArray();
        for (int i = 0; i < message.length(); i++) {
            stack.push(ch[i]);
        }

        while (!stack.isEmpty()) {
            answer.append(stack.pop());
        }

        return answer.toString();
    }


}
