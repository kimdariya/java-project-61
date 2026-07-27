package org.example;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void prog(Scanner scanner) {
        Greet.greeting(scanner);
        System.out.println("What number is missing in the progression?");

        int correctCounter = 0;
        String ans;
        Random random = new Random();

        while (true) {
            int delta = random.nextInt(100) + 1;
            int start = random.nextInt(100) + 1;
            int position = random.nextInt(10);

            System.out.println("Question: " + progressionLine(delta, start, position));
            int correctResult = progressionElement(start, delta, position);

            try {
                System.out.print("Your answer: ");
                ans = scanner.nextLine().toLowerCase();

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
                    break;
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
