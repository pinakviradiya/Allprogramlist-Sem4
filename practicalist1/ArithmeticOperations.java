import java.util.Scanner;

public class ArithmeticOperations 
{
    public static void main(String[] args)
	 {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the second integer (b): ");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("Addition (a + b): " + sum);
        int difference = a - b;
        System.out.println("Subtraction (a - b): " + difference);
        int product = a * b;
        System.out.println("Multiplication (a * b): " + product);
        if (b != 0) 
		{
            double quotient = (double) a / b;
            System.out.println("Division (a / b): " + quotient);
        } 
	   else
		 {
            System.out.println("Division by zero is undefined.");
        }
        if (b != 0) 
		{
            int remainder = a % b;
            System.out.println("Modulo (a % b): " + remainder);
        } 
	else 
		{
            System.out.println("Modulo by zero is undefined.");
        }
        scanner.close();
    }
}
