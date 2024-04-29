abstract class Shape {
    	protected int numberOfSides;
	public abstract double calculateArea();
}
class Triangle extends Shape{
	private double base;
	private double height;
	public Triangle(double base, double height)
{
	this.numberOfSides = 3;
	this.base= base;
	this.height= height;
}

	public double calculateArea(){
		return 0.5 * base * height;
	}
}
public class P14{
	public static void main(String args[]){
		System.out.println("Pinak viradiya");
		System.out.println("220130318014");
	Triangle triangle = new Triangle(5.0,8.0);
	System.out.println("Triangle Area:: " +triangle.calculateArea());
	System.out.println("Numbers of Sides:: "+triangle.numberOfSides);
	} 
}