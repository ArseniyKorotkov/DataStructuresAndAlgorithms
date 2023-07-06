package track4StackAndQueue.pack1Stack.p3BracketChecker;

public class BracketCheckerApp {

    public static void main(String[] args) {
        String code = "a{b(c)d}e";

        BracketChecker checker = new BracketChecker(code);
        checker.check();
    }
}
