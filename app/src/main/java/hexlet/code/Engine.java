package hexlet.code;

import java.util.Scanner;

public class Greet {
    static String firstName;
    Greet(int numOfGame) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        firstName = scanner.next();
        System.out.println("Hello, " + firstName + "!");
        if (numOfGame == 2) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            EvenGame.evenGame(1);
        }
        if (numOfGame == 3) {
            System.out.println("What is the result of the expression?");
            CalcGame.calc(1);
        }
    }
}
