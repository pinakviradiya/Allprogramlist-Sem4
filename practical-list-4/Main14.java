import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Check if the second number is not zero to avoid division by zero
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Result of division: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }

        scanner.close();
    }
}
