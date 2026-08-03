package hexlet.code;

import java.util.Scanner;

public final class Engine {
    public static final int MAX_ROUNDS = 3;
    private static final Scanner SCANNER = new Scanner(System.in);

    private Engine() {
    }

    public static void run(String description, String[][] rounds) {
        String userName = Greet.greeting(SCANNER);
        System.out.println(description);

        int correctCounter = 0;

        for (int i = 0; i < MAX_ROUNDS; i++) {
            System.out.println("Question: " + rounds[i][0]);
            String answer = SCANNER.nextLine().toLowerCase().trim();
            System.out.println("Your answer: " + answer);

            if (answer.isEmpty()) {
                System.err.println("Error! Empty input. No input detected. Please enter a value.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }

            String correctAnswer = rounds[i][1];
            if ((correctAnswer.equals("yes") || correctAnswer.equals("no"))
                    && !answer.equals("yes") && !answer.equals("no")) {
                System.err.println("Error! Invalid input. Input: '" + answer + "'. Please enter 'yes' or 'no'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }

            if (isNumber(correctAnswer) && !isNumber(answer)) {
                System.err.println("Error! Invalid input: '" + answer + "'. Please enter a number!");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }

            if (answer.equals(correctAnswer)) {
                correctCounter++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        if (correctCounter == MAX_ROUNDS) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

    private static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
