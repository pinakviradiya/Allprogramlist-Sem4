import java.util.Scanner;

public class ArrayProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	
	System.out.println("Prem Gohel");
	System.out.println("220130318003");

        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        
        int[] numbers = new int[size];

        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        
        scanner.close();

        
        int product = 0;

       
        for (int i = 0; i < size; i++) {
            product += numbers[i];
        }

        
        System.out.println("Product of array elements: " + product);
    }
}
