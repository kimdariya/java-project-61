package hexlet.code;

import java.util.Random;
import java.util.Scanner;


public class Calc {
    private static final int MAX_NUMBER = 100;
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final String DESCRIPTION = "What is the result of the expression?";

    private Calc() {
    }

    public static void calc() {

        String[][] rounds = new String[Engine.MAX_ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int num1 = random.nextInt(MAX_NUMBER) + 1;
            int num2 = random.nextInt(MAX_NUMBER) + 1;
            char operator = OPERATORS[random.nextInt(OPERATORS.length)];

            rounds[i][0] = num1 + " " + operator + " " + num2;
            rounds[i][1] = String.valueOf(calculate(num1, num2, operator));

        }
        Engine.run(DESCRIPTION, rounds);
    }

    private static int calculate(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }
}
