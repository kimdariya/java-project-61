package hexlet.code;

import java.util.Random;

public class Progression {
    private static final int MAX_NUMBER = 100;
    private static final int MAX_POS = 10;
    private static final String DESCRIPTION = "What number is missing in the progression?";

    private Progression() {
    }

    public static void prog() {

        String[][] rounds = new String[Engine.MAX_ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int delta = random.nextInt(MAX_NUMBER) + 1;
            int start = random.nextInt(MAX_NUMBER) + 1;
            int position = random.nextInt(MAX_POS);

            String fullLine = progressionLine(delta, start);
            String[] parts = fullLine.split(" ");
            parts[position] = "..";
            String question = String.join(" ", parts);
            rounds[i][0] = question;
            rounds[i][1] = String.valueOf(start + delta * position);
        }
        Engine.run(DESCRIPTION, rounds);
    }

    private static String progressionLine(int delta, int start) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int value = start + delta * i;
            line.append(value);
            if (i < 9) {
                line.append(" ");
            }
        }
        return line.toString();
    }

}
