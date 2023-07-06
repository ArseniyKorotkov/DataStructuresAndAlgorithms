package track6Recursion.pack2Factorial;

public class Factorial {

    public int recursionfactorial(int n) {
        if(n == 1) {
            System.out.println("return 1");
            return 1;
        } else {
            int temp = recursionfactorial(n - 1) * n;
            System.out.println("return " + temp);
            return temp;
        }
    }
}
