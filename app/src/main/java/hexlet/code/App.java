package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        String mode = scanner.nextLine();
        System.out.println("Your choice: " + mode);

        if (mode.equals("1")) {
            Greet.greeting(scanner);
        } else if (mode.equals("2")) {
            Even.even();
        } else if (mode.equals("3")) {
            Calc.calc();
        } else if (mode.equals("4")) {
            GCD.gcd();
        } else if (mode.equals("5")) {
            Progression.prog();
        } else if (mode.equals("6")) {
            Prime.prime();
        } else if (mode.equals("0")) {
            System.out.println("Goodbye!");
        } else {
            System.out.println("Error! :( Invalid mode entered: '" + mode + "'. Please enter a number from 0 to 6.");
        }
        scanner.close();
    }

}
