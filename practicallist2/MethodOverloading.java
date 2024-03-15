import java.util.*;
 class Overloading
 {
    public int add(int a, int b) 
{
        return a + b;
    }

    public int add(int a, int b, int c) 
{
        return a + b + c;
    }
    public double add(double a, double b) 
{
        return a + b;
    }
  public String add(String a, String b) 
{
        return a + b;
    }

    public static void main(String[] args)
 {
        MethodOverloadingExample example = new MethodOverloadingExample();
        System.out.println("Sum of 5 and 7: " + example.add(5, 7));
        System.out.println("Sum of 5, 7, and 10: " + example.add(5, 7, 10));
        System.out.println("Sum of 3.5 and 2.5: " + example.add(3.5, 2.5));
        System.out.println("Concatenation of 'Hello' and 'World': " + example.add("Hello", "World"));
    }
}
