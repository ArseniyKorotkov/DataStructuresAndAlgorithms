package track8BinaryTrees.pack2Projects.p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeOfThreesApp {

    public static void main(String[] args) throws IOException {
        ThreeOfThrees threes = new ThreeOfThrees();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String letter = reader.readLine();
            threes.insert(letter);
            threes.showSizes();
            System.out.println();
            if(threes.getThree(5) != null) {
                threes.showThree(5);
            }

        }

    }
}
