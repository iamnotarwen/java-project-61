package hexlet.code;

import java.util.Scanner;

public class Greet {
    static String firstName;
    Greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        firstName = scanner.next();
    }
}
