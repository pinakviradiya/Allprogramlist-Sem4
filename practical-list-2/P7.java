import java.util.*;
public class P7 {
   
    public int add(int a, int b) {
        return a + b;
    }

   
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    
    public double add(double a, double b) {
        return a + b;
    }

    
    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        P7 calculator = new P7();

        System.out.println("Pinak viradiya");
		System.out.println("220130318014");
        System.out.println("Sum of 2 and 3 is: " + calculator.add(2, 3));
        System.out.println("Sum of 2, 3, and 4 is: " + calculator.add(2, 3, 4));
        System.out.println("Sum of 2.5 and 3.5 is: " + calculator.add(2.5, 3.5));
        System.out.println("Sum of 2.5, 3.5, and 4.5 is: " + calculator.add(2.5, 3.5, 4.5));
    }
}
