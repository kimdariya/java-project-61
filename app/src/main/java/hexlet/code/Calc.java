package hexlet.code;

import java.util.Random;
import java.util.Scanner;


public class Calc {
    private static final int MAX_ROUNDS = 3;
    private static final int MAX_NUMBER = 100;
    private static final char[] OPERATORS = {'+', '-', '*'};

    private Calc() {
    }

    public static void calc(Scanner scanner) {

        String[][] rounds = new String[MAX_ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < MAX_ROUNDS; i++) {
            int num1 = random.nextInt(MAX_NUMBER) + 1;
            int num2 = random.nextInt(MAX_NUMBER) + 1;
            char operator = OPERATORS[random.nextInt(OPERATORS.length)];

            rounds[i][0] = num1 + " " + operator + " " + num2;
            rounds[i][1] = String.valueOf(calculate(num1, num2, operator));

        }
        Engine.run(scanner, "What is the result of the expression?", rounds);
    }

    private static int calculate(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
        }
    }

}
