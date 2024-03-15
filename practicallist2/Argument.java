import java.util.*;
public class Argument 
{
    private String name;
    private int age;
    
    public Person(String name, int age) 
{
        this.name = name;
        this.age = age;
    }
    
    public void displayInfo() 
{
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    

    public static void main(String[] args) 
{
	system.out.println("Pinak Viradiya");
	system.out.println("Er No:- 220130318014");
        Person person1 = new Person("Pinak", 30);
        Person person2 = new Person("Khush", 25);
        
        System.out.println("Person 1:");
        person1.displayInfo();
        
        System.out.println("\nPerson 2:");
        person2.displayInfo();
    }
}
