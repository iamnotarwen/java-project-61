package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String firstName;
    public static void engine(int numOfGame) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        firstName = scanner.next();
        System.out.println("Hello, " + firstName + "!");
        if (numOfGame == 2) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            games.EvenGame.evenGame(1);
        }
        if (numOfGame == 3) {
            System.out.println("What is the result of the expression?");
            games.CalcGame.calc(1);
        }
        if (numOfGame == 4) {
            System.out.println("Find the greatest common divisor of given numbers.");
            games.GreatDivider.greatDivider(1);
        }
    }
}
