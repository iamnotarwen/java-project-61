package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        String userChoice = scanner.next();

        if (userChoice.equals("0")) {
            System.out.println("See you soon!");
        } else if (userChoice.equals("1")) {
            System.out.println("Your choice: " + userChoice);
            greet();
        } else if (userChoice.equals("2")) {
            System.out.println("Your choice: " + userChoice);
            EvenGame.greeting();
        }
    }

    public static String greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        return userName;
    }

}
