package org.example;

import java.util.Random;
import java.util.Scanner;

public class Even {

    public static void even(Scanner scanner) {

        Greet.greeting(scanner);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();
        int correctCounter = 0;

        while (correctCounter < 3) {

            int num = random.nextInt(100) + 1;
            System.out.println("Question: " + num);

            System.out.print("Your answer: ");
            String ans = scanner.nextLine().toLowerCase();

            if (!ans.equals("yes") && !ans.equals("no")) {
                System.out.println("Let's try again, " + Greet.name + "!");
                correctCounter = 0;
                continue;
            }

            if (num % 2 == 0 && ans.equals("yes")) {
                System.out.println("Correct!");
                correctCounter++;
            } else if (num % 2 != 0 && ans.equals("no")) {
                System.out.println("Correct!");
                correctCounter++;
            } else {
                System.out.println("Let's try again, " + Greet.name + "!");
                correctCounter = 0;
            }

            if (correctCounter == 3) {
                System.out.println("Congratulations, " + Greet.name + "!");
            }

        }

    }

}
