import java.util.*;
public class AreaofCircle
{
	public static void main(String args[])
	{
		double radius;
		double pi=3.14,area;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Prem Gohel");
		System.out.println("220130318003");
		System.out.print("Enter the radius    : :");
		radius = sc.nextDouble();

		area=pi*radius*radius;

		System.out.println("The circle of area is ::"+area);

	}
}