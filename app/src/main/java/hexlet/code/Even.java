package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static final int MAX_NUMBER = 100;
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private Even() {
    }

    public static void even() {

        Random random = new Random();
        String[][] rounds = new String[Engine.MAX_ROUNDS][2];
        int correctCounter = 0;

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int num = random.nextInt(MAX_NUMBER) + 1;
            rounds[i][0] = String.valueOf(num);
            rounds[i][1] = (num % 2 == 0) ? "yes" : "no";
        }

        Engine.run(DESCRIPTION, rounds);

    }

}
