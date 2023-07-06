package track4StackAndQueue.pack4Projects.p5;

import java.util.Random;

public class Person {

    private final int sizeBasket;
    private static int nameIndex;
    private final int name;

    public Person() {
        nameIndex++;
        name = nameIndex;
        sizeBasket = new Random().nextInt(10);
    }

    public int getSizeBasket() {
        return sizeBasket;
    }

    @Override
    public String toString() {
        return "person" + name;
    }
}
