package track13Graph.pack2Projects.p5;

public class Vertex {

    private final int[] field;
    private final int position;
    private static int counter;

    public Vertex(int[] field, int position) {
        this.field = field.clone();
        this.position = position;
        this.field[position] = counter++;
    }

    public int[] getField() {
        return field;
    }

    public int getPosition() {
        return position;
    }

    public static void minusCounter() {
        if (counter != 0) counter--;
    }

    public static int getCounter() {
        return counter;
    }
}
