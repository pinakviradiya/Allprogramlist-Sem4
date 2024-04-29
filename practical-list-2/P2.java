import java.util.*;
public class P2 {
    // Static method to calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	System.out.println("Pinak viradiya");
		System.out.println("220130318014");

      System.out.print("Enter a number to calculate its factorial: ");
        int number = sc.nextInt();
        
        sc.close();
        
        
        int result = factorial(number);
	        

        
        System.out.println("Factorial of " + number + " is: "+ result);
    }
}
