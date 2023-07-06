package track6Recursion.pack5TowerOfHanoi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GamerApp {

    private static int gameSize;
    private static TowerOfHanoi tower;
    private static BufferedReader reader;
    private static Boolean autoAnswer;

    public static void main(String[] args) {
        startGameOperation();
        if(autoAnswer) {
            answerTask();
        } else {
            gameProcess();
        }
    }

    private static void startGameOperation() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Hello! ");
        while (gameSize < 1 || gameSize > Stock.maxSize()) {
            System.out.print("Write game size (not more than 8): ");
            try {
                gameSize = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("Not correct game size. Try again...");
            }
        }
        System.out.println();
        while(autoAnswer == null) {
            System.out.print("You want computer doing this task? Y/N ");
            try {
                String answer = reader.readLine();
                if (answer.equals("Y") || answer.equals("y")) {
                    autoAnswer = true;
                } else if(answer.equals("N") || answer.equals("n")) {
                    autoAnswer = false;
                } else {
                    System.out.println("Not correct answer. Try again...");
                }
            } catch (IOException ignored) {

            }

        }
        System.out.println("Start game...");
        tower = new TowerOfHanoi(gameSize);
        tower.showStocks();
    }

    private static void gameProcess() {
        while (!tower.checkGameOver()) {
            System.out.print("Your change step: ");
            int[] change = writtenChange();
            System.out.println();
            tower.changeOfTowers(change[0], change[1]);
        }
    }

    private static int[] writtenChange() {
        int[] change = new int[2];
        boolean checkOkChange = false;
        while (!checkOkChange) {
            try {
                String changeString = reader.readLine();
                change[0] = Integer.parseInt(String.valueOf(changeString.charAt(0)));
                change[1] = Integer.parseInt(String.valueOf(changeString.charAt(2)));

                if (changeString.charAt(1) != ' ') {
                    throw new StringIndexOutOfBoundsException();
                }


                checkOkChange = true;

            } catch (IOException | StringIndexOutOfBoundsException ex) {
                System.out.print("Not good format change. Need enter number like \"1 3\". Your next step: ");
                System.out.println();
            }
        }
        return change;
    }

    private static void answerTask() {
        TowerOfHanoiAnswerer answerer = new TowerOfHanoiAnswerer(tower);
    }


}
