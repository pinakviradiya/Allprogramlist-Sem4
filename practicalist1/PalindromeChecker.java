import java.util.Scanner;

public class PalindromeChecker 
	{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number or string to check if it's a palindrome: ");
        String input = scanner.nextLine();
        boolean isPalindrome = checkPalindrome(input);
        if (isPalindrome) 
	{
            System.out.println(input + " is a palindrome.");
        }
	 else 
		{
            System.out.println(input + " is not a palindrome.");
        }
        scanner.close();
    }
        public static boolean checkPalindrome(String input) 
	{
        int left = 0;
        int right = input.length() - 1;
        while (left < right) 
	{
            if (input.charAt(left) != input.charAt(right)) 
	{
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }
}
