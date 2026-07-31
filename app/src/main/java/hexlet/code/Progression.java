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

        String[][] rounds = new String[MAX_ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < MAX_ROUNDS; i++) {
            int delta = random.nextInt(MAX_NUMBER) + 1;
            int start = random.nextInt(MAX_NUMBER) + 1;
            int position = random.nextInt(MAX_POS);

            rounds[i][0] = String.valueOf(progressionLine(delta, start, position));
            rounds[i][1] = String.valueOf(start + delta * position);
        }
        Engine.run(scanner, "What number is missing in the progression?", rounds);
    }

    private static String progressionLine(int delta, int start, int position) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int value = start + delta * i;
            if (i == position) {
                line.append(" ..");
            } else {
                line.append(" ").append(value);
            }
        }
        return line.toString().trim();
    }

}
