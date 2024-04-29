import java.util.Scanner;

public class P4 {
    private int radius;

    // Constructor to initialize the radius
    public P4(int radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");

        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();

        sc.close();

        // Creating a Circle object with the provided radius
        P4 circle = new P4(radius);

        // Calculating and displaying the area of the circle
        double area = circle.calculateArea();
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
