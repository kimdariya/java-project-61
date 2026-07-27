package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void prime(Scanner scanner) {
        Greet.greeting(scanner);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int correctCounter = 0;
        Random random = new Random();

        while (correctCounter < 3) {
            int num = random.nextInt(100) + 1;

            System.out.println("Question: " + num);
            System.out.print("Your answer: ");
            String ans = scanner.nextLine().toLowerCase();

            if ((isPrime(num) && ans.equals("yes")) || (!isPrime(num) && ans.equals("no"))) {
                correctCounter++;
                System.out.println("Correct!");
            } else {
                String correctAnswer = isPrime(num) ? "yes" : "no";
                System.out.println("'" + ans + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + Greet.name + "!");
                correctCounter = 0;
            }

            if (correctCounter == 3) {
                System.out.println("Congratulations, " + Greet.name + "!");
            }
        }
    }

    private static boolean isPrime(int num) {
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        boolean flag = false;
        for (int i : arr) {
            if (num == i) {
                flag = true;
                break;
            }
        }
        return flag;
    }


}
