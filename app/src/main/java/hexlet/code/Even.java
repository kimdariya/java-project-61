package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static final int MAX_ROUNDS = 3;
    private static final int MAX_NUMBER = 100;

    private Even() {
    }

    public static void even(Scanner scanner) {

        Random random = new Random();
        String[][] rounds = new String[MAX_ROUNDS][2];
        int correctCounter = 0;

        for (int i = 0; i < MAX_ROUNDS; i++) {
            int num = random.nextInt(MAX_NUMBER) + 1;
            rounds[i][0] = String.valueOf(num);
            rounds[i][1] = (num % 2 == 0) ? "yes" : "no";
        }

        Engine.run(scanner, "Answer 'yes' if the number is even, otherwise answer 'no'.", rounds);

    }

}
