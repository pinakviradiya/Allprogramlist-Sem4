import java.util.Scanner;
	
public class PrimeNumberChecker 
	{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to check if it's prime: ");
        int n = scanner.nextInt();
        boolean isPrime = checkPrime(n);
        if (isPrime) 
	{
            System.out.println(n + " is a prime number.");
        }
	 else 
	{
            System.out.println(n + " is not a prime number.");
        }
        scanner.close();
    }
    public static boolean checkPrime(int n) {
        if (n <= 1) 
	{
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) 
	{
       	    if (n % i == 0) 
	{
                return false; 
            }
        }
        return true; 
    }
}
