package hexlet.code;

//import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//import hexlet.code.Engine;
//import java.lang.Math;

public class games {
    public static class EvenGame {
        public static void evenGame(int count) {
            if (count == 4) {
                System.out.println("Congratulations, " + Engine.firstName + "!");
            }
            if (count < 4 && count > 0) {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                int num = random.nextInt(50);
                System.out.println("Question: " + num);
                String userAnswer = scanner.next();
                System.out.println("Your answer: " + userAnswer);
                String i;
                String j;
                if ((userAnswer.equals("yes") && num % 2 != 0) || (userAnswer.equals("no") && num % 2 == 0)) {
                    if (userAnswer.equals("yes")) {
                        i = "yes";
                        j = "no";
                    } else {
                        i = "no";
                        j = "yes";
                    }
                    System.out.println(i + " is wrong answer ;(. Correct answer was " + j + ".");
                    System.out.println("Let's try again, " + Engine.firstName);
                    scanner.close();

                } else if (!userAnswer.equals("yes") && !userAnswer.equals("no")) {
                    System.out.println(userAnswer + " is wrong answer ;(. Correct 'yes' or 'no'.");
                    System.out.println("Let's try again, " + Engine.firstName);
                    scanner.close();

                } else if ((userAnswer.equals("yes") && (num % 2 == 0))
                        || (userAnswer.equals("no") && (num % 2 != 0))) {
                    System.out.println("Correct!");
                    evenGame(count + 1);
                }
            }
        }
    }

    public static class CalcGame {
        public static int add(int a, int b) {
            return a + b;
        }

        public static int minus(int a, int b) {
            return a - b;
        }

        public static int multy(int a, int b) {
            return (a * b);
        }

        public static void calc(int count) {
            if (count == 4) {
                System.out.println("Congratulations, " + Engine.firstName + "!");
            } else if (count < 4 && count > 0) {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                int solution = 0;
                int a = random.nextInt(20);
                int b = random.nextInt(20);
                int i = random.nextInt(3);

                switch (i) {
                    case 0:
                        solution = add(a, b);
                        System.out.println("Question: " + a + " + " + b);
                        break;
                    case 1:
                        solution = minus(a, b);
                        System.out.println("Question: " + a + " - " + b);
                        break;
                    case 2:
                        solution = multy(a, b);
                        System.out.println("Question: " + a + " * " + b);
                        break;
                }
                String userAnswer = scanner.next();
                if (userAnswer.equals(Integer.toString(solution))) {
                    System.out.println("Correct!");
                    calc(count + 1);
                } else {
                    System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + solution + ".");
                    System.out.println("Let's try again, " + Engine.firstName);
                }
            }
        }
    }

    public static class GreatDivider {
        public static void greatDivider(int count) {
            if (count == 4) {
                System.out.println("Congratulations, " + Engine.firstName + "!");
            } else if (count < 4 && count > 0) {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                int result = 0;
                int a = 1 + random.nextInt(50);
                int b = 1 + random.nextInt(50);
                int maxNum = a;
                int minNum = b;
                if (a < b) {
                    maxNum = b;
                    minNum = a;
                }
                for (int i = 1; i <= minNum; i++) {
                    if (maxNum % i == 0 && minNum % i == 0) {
                        result = i;
                    }
                }
                System.out.println("Question: " + a + " " + b);
                String userAnswer = scanner.next();
                if (userAnswer.equals(Integer.toString(result))) {
                    System.out.println("Correct!");
                    greatDivider(count + 1);
                } else {
                    System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + result + ".");
                    System.out.println("Let's try again, " + Engine.firstName);
                }
            }
        }
    }

    public static class Progression {
        public static void progression(int count) {
            if (count == 4) {
                System.out.println("Congratulations, " + Engine.firstName + "!");
            } else if (count < 4 && count > 0) {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                int startNumber = random.nextInt(20);
                int countNumbers = 5 + random.nextInt(5);
                int numOfProgressive = 1 + random.nextInt(5);
                int indexOfPastNum = 1 + random.nextInt(countNumbers - 1);
                System.out.print("Question: " + startNumber);
                int correctResponse = 0;
                for (int i = 1; i < countNumbers; i++) {
                    if (i == indexOfPastNum) {
                        correctResponse = startNumber + i * numOfProgressive;
                        System.out.print(" " + "..");
                    } else {
                        int nextNum = startNumber + i * numOfProgressive;
                        System.out.print(" " + nextNum);
                    }
                }
                System.out.println();
                String userAnswer = scanner.next();
                if (userAnswer.equals(Integer.toString(correctResponse))) {
                    System.out.println("Correct!");
                    progression(count + 1);
                } else {
                    System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctResponse + ".");
                    System.out.println("Let's try again, " + Engine.firstName);
                }
            }
        }
    }
    public static class Prime {
        public static void prime(int count) {
            if (count == 4) {
                System.out.println("Congratulations, " + Engine.firstName + "!");
            } else if (count < 4 && count > 0) {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                int num = 2 + random.nextInt(10);
                System.out.println("Question: " + num);
                String answerUser = scanner.next();

                if (answerUser.equals("yes") && checkPrime(num)) {
                    System.out.println("Correct!");
                    prime(count + 1);
                } else if (answerUser.equals("no") && !checkPrime(num)) {
                    System.out.println("Correct!");
                    prime(count + 1);
                } else {
                    System.out.println(answerUser + " is wrong answer ;(.");
                    System.out.println("Let's try again, " + Engine.firstName);
                }
            }
        }
        public static boolean checkPrime(int number) {
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    sum++;
                }
            }
            return sum < 3;
        }
    }
}
