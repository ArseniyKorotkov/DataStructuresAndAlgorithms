package track6Recursion.pack9Projects.p1;

public class CheapCalculator {

    public int mult(int x, int y) {

        if(y == 1) {
            return x;
        }

        if (y % 2 == 1) {
            x = mult(x + x, y / 2) + x;
        } else {
            x = mult(x + x, y / 2);
        }
        return x;
    }
}
