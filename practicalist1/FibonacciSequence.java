import java.util.Scanner;

public class FibonacciSequence 
	{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci sequence with " + n + " terms:");
        for (int i = 0; i < n; i++) 
	{
            System.out.print(fibonacci(i) + " ");
        }
        scanner.close();
    }
    public static int fibonacci(int n) {
        if (n <= 1) 
	{
            return n;
        }
		else 
		{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
