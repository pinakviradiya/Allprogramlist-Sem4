import java.util.InputMismatchException;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (enter a non-numeric value to exit):");
        while (true) {
            try {
                int number = scanner.nextInt(); // Read an integer from the user
                System.out.println("You entered: " + number);
            } catch (InputMismatchException e) {
                System.out.println("Pinak viradiya");
		        System.out.println("220130318014");
                System.out.println("Error: Input must be an integer.");
                scanner.next(); // Clear the invalid input from the scanner
                break; // Exit the loop when non-numeric input is encountered
            }
        }

        scanner.close();
    }
}
