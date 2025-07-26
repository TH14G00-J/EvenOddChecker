import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = getValidatedIntegerInput (sc);

        if(number % 2 == 0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }

    public static int getValidatedIntegerInput (Scanner sc) {
        while(!sc.hasNextDouble()) {
            System.out.println("Invalid information. Please enter an integer.");
            sc.next();
        }
        return sc.nextInt();
    }
}