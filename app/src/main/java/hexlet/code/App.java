package hexlet.code;

import java.util.Scanner;

public class App {
    static String userChoice;
    static final int GAME_NUMBER_EVEN = 2;
    static final int GAME_NUMBER_CALC = 3;
    static final int GAME_NUMBER_GCP = 4;
    static final int GAME_NUMBER_PROGRESSION = 5;
    static final int GAME_NUMBER_PRIME = 6;

    public static void main(String[] args) {
        int numberOfGame;
        String[] listOfGames = {"Exit", "Greet", "Even", "Calc", "GCD", "Progression", "Prime"};


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        for (int i = 1; i < 7; i++) {
            numberOfGame = i;
            System.out.println(numberOfGame + " - " + listOfGames[i]);
        }
        System.out.println("0 - " + listOfGames[0]);

        userChoice = scanner.next();
        System.out.println("Your choice: " + userChoice);
        if (Integer.parseInt(userChoice) != 0) {
            Engine.engine(Integer.parseInt(userChoice));
        } else {
            System.out.println("See you soon!");
        }
    }
}
