package hexlet.code;

import java.util.Scanner;


public class Engine {
    static String firstName;
    public static void engine(int numOfGame) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        firstName = scanner.next();
        System.out.println("Hello, " + firstName + "!");
        if (numOfGame == App.GAME_NUMBER_EVEN) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            games.EvenGame.evenGame(1);
        }
        if (numOfGame == App.GAME_NUMBER_CALC) {
            System.out.println("What is the result of the expression?");
            games.CalcGame.calc(1);
        }
        if (numOfGame == App.GAME_NUMBER_GCP) {
            System.out.println("Find the greatest common divisor of given numbers.");
            games.GreatDivider.greatDivider(1);
        }
        if (numOfGame == App.GAME_NUMBER_PROGRESSION) {
            System.out.println("What number is missing in the progression?");
            games.Progression.progression(1);
        }
        if (numOfGame == App.GAME_NUMBER_PRIME) {
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            games.Prime.prime(1);
        }
    }
}
