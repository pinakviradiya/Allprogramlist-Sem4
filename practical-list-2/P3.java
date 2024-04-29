import java.util.*;

public class P3 {
    private double length;
    private double width;

    // Default constructor
    public P3() {
        length = 0.0;
        width = 0.0;
    }

    // Overloaded constructor with parameters
    public P3(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Pinak viradiya");
      System.out.println("220130318014");

        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of the rectangle: ");
        double width = sc.nextDouble();

        sc.close();

	 P3 rectangle = new P3(length, width);

        // Displaying area of the rectangle
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());

    }
}
