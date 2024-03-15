import java.util.*;
public class Student 
{
    private String name;
    private int age;

    public Student(String name, int age) 
{
        this.name = name;
        this.age = age;
    }

    public void display() 
{
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) 
{
        Student student1 = new Student("prince", 20);
        Student student2 = new Student("khush", 22);

        System.out.println("Details of Student 1:");
        student1.display();

        System.out.println("\nDetails of Student 2:");
        student2.display();
    }
}
