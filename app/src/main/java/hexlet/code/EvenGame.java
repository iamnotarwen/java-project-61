package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    public static void greeting() {
        Greet greeting = new Greet();
        System.out.println("Hello, " + greeting.firstName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        evenGame(1);
    }
    public static void evenGame(int count) {
        if (count == 4) {
            System.out.println("Congratulations, " + Greet.firstName + "!");
        }
        if (count < 4 && count > 0) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int num = random.nextInt();
            System.out.println("Question: " + num);
            String userAnswer = scanner.next();
            System.out.println("Your answer: " + userAnswer);
            String answerUser = userAnswer;
            String yes = "yes";
            String no = "no";
            String i;
            String j;
            if ((answerUser.equals(yes) && num % 2 != 0) || (answerUser.equals(no) && num % 2 == 0)) {
                if (answerUser.equals(yes)) {
                    i = yes;
                    j = no;
                } else {
                    i = no;
                    j = yes;
                }
                System.out.println(i + " is wrong answer ;(. Correct answer was " + j + ".");
                System.out.println("Let's try again, " + Greet.firstName);
                scanner.close();

            } else if (!answerUser.equals("yes") && !answerUser.equals("no")) {
                System.out.println(answerUser + " is wrong answer ;(. Correct 'yes' or 'no'.");
                System.out.println("Let's try again, " + Greet.firstName);
                scanner.close();

            } else if ((answerUser.equals("yes") && (num % 2 == 0)) || (answerUser.equals("no") && (num % 2 != 0))) {
                System.out.println("Correct!");
                evenGame(count + 1);
            }
        }
    }
}
