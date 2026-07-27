package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GCD {

    public static void gcd(Scanner scanner) {
        Greet.greeting(scanner);
        System.out.println("Find the greatest common divisor of given numbers.");

        int correctCounter = 0;
        Random random = new Random();

        while (correctCounter < 3) {
            int num1 = random.nextInt(100) + 1;
            int num2 = random.nextInt(100) + 1;
            System.out.println("Question: " + num1 + " " + num2);


            int correctResult = findGcd(num1, num2);
            try {
                System.out.print("Your answer: ");
                String ans = scanner.nextLine().toLowerCase();

                if (correctResult == Integer.parseInt(ans)) {
                    correctCounter++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + ans + "' is wrong answer ;(. Correct answer was '" + correctResult + "'.");
                    System.out.println("Let's try again, " + Greet.name + "!");
                    correctCounter = 0;
                }

                if (correctCounter == 3) {
                    System.out.println("Congratulations, " + Greet.name + "!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number!");
                correctCounter = 0;
            }
        }
    }

    private static int findGcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

}
