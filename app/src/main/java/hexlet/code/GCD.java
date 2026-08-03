package hexlet.code;

import java.util.Random;

public final class GCD {
    private static final int MAX_NUMBER = 100;
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    private GCD() {
    }

    public static void gcd() {

        String[][] rounds = new String[Engine.MAX_ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int num1 = random.nextInt(MAX_NUMBER) + 1;
            int num2 = random.nextInt(MAX_NUMBER) + 1;

            rounds[i][0] = String.valueOf(num1 + " " + num2);
            rounds[i][1] = String.valueOf(findGcd(num1, num2));
        }

        Engine.run(DESCRIPTION, rounds);
    }

    private static int findGcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

}
