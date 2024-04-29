import java.util.InputMismatchException;
import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        try {
            System.out.println("Pinak viradiya");
		    System.out.println("220130318014");
            Scanner scanner = new Scanner(System.in);

            double num1 = getValidNumber(scanner, "Enter the first number: ");
            double num2 = getValidNumber(scanner, "Enter the second number: ");

            if (num2 != 0) {
                double result = num1 / num2;
                System.out.println("Result of division: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static double getValidNumber(Scanner scanner, String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a numeric value.");
                scanner.nextLine(); // Clear the invalid input
            }
        }
    }
}
