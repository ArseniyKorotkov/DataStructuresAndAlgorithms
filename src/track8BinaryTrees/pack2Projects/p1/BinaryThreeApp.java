package track8BinaryTrees.pack2Projects.p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryThreeApp {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BinaryThree three = new BinaryThree();
        while (true) {
            String letter = reader.readLine();
            three.insert(letter);
            three.showThree(three.getRootNode(), 0);
            System.out.println();
        }
    }
}
