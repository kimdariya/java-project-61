package hexlet.code;

import java.util.Random;

public final class Progression {
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

            String[] progression = makeProgression(start, delta, MAX_POS);
            String answer = progression[position];
            progression[position] = "..";
            String question = String.join(" ", progression);
            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        Engine.run(DESCRIPTION, rounds);
    }

    private static String[] makeProgression(int start, int delta, int length) {
        String[] result = new String[length];
        for (int i = 0; i < length; i++) {
            result[i] = String.valueOf(start + delta * i);
        }
        return result;
    }

}
