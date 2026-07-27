package hexlet.code;

import java.util.Scanner;

public class Greet {
    static String name;

    private Greet() {
    }

    public static void greeting(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
