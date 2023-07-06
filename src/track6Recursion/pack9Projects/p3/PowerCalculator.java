package track6Recursion.pack9Projects.p3;

public class PowerCalculator {

    public int power(int x, int y) {

        if (y == 1) {
            return x;
        }


        if (y % 2 == 1) {
            x = power(x * x, y / 2) * x;
        } else {
            x = power(x * x, y / 2);
        }

        return x;
    }
}
