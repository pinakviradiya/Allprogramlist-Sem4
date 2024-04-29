import java.util.Scanner;

class PrimeNum
{

public static void main(String[] args) {
      
      int count = 0;
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Pinak viradiya");
		System.out.println("220130318014");
      System.out.println("Enter a number to check prime number");
      
      int num = sc.nextInt();
      
      if(num == 2) 
	{
         	System.out.println(num + " is a prime number");
      } else {
         
         for(int i = 1; i <= num; i++) 
	 {
            if(num % i == 0) 
	    {
               count++;
            }
         }
        
         if(count == 2) 
	 {
            System.out.println(num + " is a prime number");
         } else {
            System.out.println(num + " is not a prime number");
         }
      }
   }
}