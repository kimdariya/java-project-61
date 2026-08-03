package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    private static final int MAX_NUMBER = 100;
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private Prime() {
    }

    public static void prime() {

        String[][] rounds = new String[Engine.MAX_ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int num = random.nextInt(MAX_NUMBER) + 1;

            rounds[i][0] = String.valueOf(num);
            rounds[i][1] = isPrime(num) ? "yes" : "no";
        }

        Engine.run(DESCRIPTION, rounds);
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
