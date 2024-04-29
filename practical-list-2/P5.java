import java.util.*;
public class P5 {
    private String name;
    private int age;

    // Constructor
    public P5(String name, int age) {
        this.name = name; // 'this' keyword is used to refer to the instance variable 'name'
        this.age = age;   // 'this' keyword is used to refer to the instance variable 'age'
    }

    // Method to display information about the student
    public void displayInfo() {
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");
        System.out.println("Name: " + this.name); // 'this' keyword is optional here
        System.out.println("Age: " + this.age);   // 'this' keyword is optional here
    }

    public static void main(String[] args) {
        // Creating an object of Student class
        P5 student = new P5("jay", 20);
        
        // Displaying information about the student
        student.displayInfo();
    }
}
