package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    private static final int MAX_ROUNDS = 3;
    private static final int MAX_NUMBER = 100;
    private static final int MAX_POS = 10;
    private static final String QUESTION_MESSAGE = "Question: ";

    private Progression() {
    }

    public static void prog(Scanner scanner) {
        Greet.greeting(scanner);
        System.out.println("What number is missing in the progression?");

        int correctCounter = 0;
        String ans;
        Random random = new Random();

        while (correctCounter < MAX_ROUNDS) {
            int delta = random.nextInt(MAX_NUMBER) + 1;
            int start = random.nextInt(MAX_NUMBER) + 1;
            int position = random.nextInt(MAX_POS);

            System.out.println(QUESTION_MESSAGE + progressionLine(delta, start, position));
            int correctResult = progressionElement(start, delta, position);

            try {
                ans = scanner.nextLine().toLowerCase();
                System.out.println("Your answer: " + ans);

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

    private static int progressionElement(int delta, int start, int position) {
        return start + delta * position;
    }

    private static String progressionLine(int delta, int start, int position) {
        int temp = start;
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            if (i == position) {
                line.append(" ..");
            } else {
                line.append(" ").append(temp);
            }
            temp += delta;
        }
        return line.toString().trim();
    }

}
