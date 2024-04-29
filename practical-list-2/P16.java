import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {

        System.out.println("Pinak viradiya");
		System.out.println("220130318014");

        Scanner sc = new Scanner(System.in);

        // Get user input for name, age, and favorite color
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter your favorite color: ");
        String color = sc.nextLine();

        // Use String.format() to print out a message with the user's input
        String message = String.format("Hello, my name is " + name + " I am " + age + " years old and my favorite color is " + color +".");
        System.out.println(message);
    }
}
