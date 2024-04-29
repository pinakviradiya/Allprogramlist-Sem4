import java.util.Scanner;
                 
class MatheOpretion 
{
    public static void main(String args[])
  {
    int a,b, add, subtract, multiply,modulo;
    float devide;
    Scanner sc = new Scanner(System.in);
    System.out.println("Pinak viradiya");
		System.out.println("220130318014");

    System.out.print("Enter Two Numbers : ");
    a = sc.nextInt();
    b = sc.nextInt();

    add = a + b;
    subtract = a - b;
    multiply = a * b;
    devide = (float)  a   /   b;
    modulo = a  %  b;	

    System.out.println("Sum            = "     + add);
    System.out.println("Difference     = "     + subtract);
    System.out.println("Multiplication = "     + multiply);
    System.out.println("Division       = "     + devide);
    System.out.println("modulo         = "     + modulo);


  }
}