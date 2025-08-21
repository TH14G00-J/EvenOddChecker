import entities.EvenOddChecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvenOddChecker evenOddChecker = new EvenOddChecker();

        System.out.print("Enter a number: ");
        int number = getValidatedIntegerInput(sc);
        System.out.println(evenOddChecker.getParity(number));
    }

    public static int getValidatedIntegerInput(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid information. Please enter an integer.");
            sc.next();
        }
        return sc.nextInt();
    }
}