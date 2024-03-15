import java.util.*;
class Person 
{
    String name;
    int age;

    public Person(String name, int age) 
{
        this.name = name;
        this.age = age;
    }
}

// Main class to demonstrate passing object as parameter
public class ObjectPassingExample {

    // Method that takes a Person object as a parameter and prints its details
    static void printPersonDetails(Person person) {
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }

    public static void main(String[] args) {
        // Create a Person object
        Person person1 = new Person("Alice", 30);

        // Pass the Person object as a parameter to the method
        printPersonDetails(person1);
    }
}
