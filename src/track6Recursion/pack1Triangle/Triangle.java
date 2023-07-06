package track6Recursion.pack1Triangle;

public class Triangle {

    public int recursionTriangle(int n) {
        if(n == 1) {
            System.out.println("return 1");
            return 1;
        } else {
            int temp = recursionTriangle(n - 1) + n;
            System.out.println("return " + temp);
            return temp;
        }
    }

    public int switchTriangle(int n) {
        return 0;
    }

    public int stackTriangle(int n) {
        return 0;
    }
}
