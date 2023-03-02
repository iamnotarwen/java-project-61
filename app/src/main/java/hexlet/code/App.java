package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");

        String userChoice = scanner.next();
        System.out.println("Your choice: " + userChoice);

        if (userChoice.equals("0")) {
            System.out.println("See you soon!");
        } else if (userChoice.equals("1")) {
            Engine greet = new Engine(1);
        } else if (userChoice.equals("2")) {
            Engine greet = new Engine(2);
        } else if (userChoice.equals("3")) {
            Engine greet = new Engine(3);
        }
    }
}
