import java.util.*;
class Temperature  
 {  
   public static void main (String args[])  
    { 
	float Fahrenheit, celsius;

	Scanner sc = new Scanner(System.in);
	System.out.println("Prem Gohel");
	System.out.println("220130318003"); 
	  
	  System.out.print("Enter the Celsius::");
	  celsius = sc.nextFloat();
	  Fahrenheit =((celsius*9)/5)+32;
  
          System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);  
    }
}  