package org.example;

import java.util.Random;
import java.util.Scanner;


public class Calc {

    public static void calc(Scanner scanner) {
        Greet.greeting(scanner);
        System.out.println("What is the result of the expression?");

        int correctCounter = 0;
        int correctResult = 0;
        String ans;
        Random random = new Random();

        while (correctCounter < 3) {
            int num1 = random.nextInt(100) + 1;
            int num2 = random.nextInt(100) + 1;

            int operation = random.nextInt(3) + 1;

            switch (operation) {
                case 1://add
                    System.out.println("Question: " + num1 + " + " + num2);
                    correctResult = add(num1, num2);
                    break;

                case 2://sub
                    System.out.println("Question: " + num1 + " - " + num2);
                    correctResult = sub(num1, num2);
                    break;

                case 3://mult
                    System.out.println("Question: " + num1 + " * " + num2);
                    correctResult = mult(num1, num2);
                    break;

                default:
                    System.out.println("Unknown operation!");
                    continue;

            }

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
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a number!");
                correctCounter = 0;
            }
        }

    }

    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int sub(int n1, int n2) {
        return n1 - n2;
    }

    public static int mult(int n1, int n2) {
        return n1 * n2;
    }

}
