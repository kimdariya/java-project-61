package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static final int MAX_ROUNDS = 3;
    private static final int MAX_NUMBER = 100;
    private static final String QUESTION_MESSAGE = "Question: ";

    private Even() {
    }

    public static void even(Scanner scanner) {

        Greet.greeting(scanner);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();
        int correctCounter = 0;

        while (correctCounter < MAX_ROUNDS) {

            int num = random.nextInt(MAX_NUMBER) + 1;
            System.out.println(QUESTION_MESSAGE + num);

            String ans = scanner.nextLine().toLowerCase();
            System.out.println("Your answer: " + ans);

            if (!ans.equals("yes") && !ans.equals("no")) {
                System.out.println("Let's try again, " + Greet.name + "!");
                correctCounter = 0;
            }

            if (num % 2 == 0 && ans.equals("yes")) {
                System.out.println("Correct!");
                correctCounter++;
            } else if (num % 2 != 0 && ans.equals("no")) {
                System.out.println("Correct!");
                correctCounter++;
            } else {
                System.out.println("Let's try again, " + Greet.name + "!");
                break;
            }

            if (correctCounter == 3) {
                System.out.println("Congratulations, " + Greet.name + "!");
            }

        }

    }

}
