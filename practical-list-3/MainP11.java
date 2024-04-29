
class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

// Define a subclass Rectangle that extends Shape
class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color); // Call super constructor to initialize color
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

// Define a subclass Circle that extends Shape
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color); // Call super constructor to initialize color
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

public class MainP11 {
    public static void main(String[] args) {
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");
        Rectangle rectangle = new Rectangle("Red", 10, 5);
        Circle circle = new Circle("Blue", 7.5);

        System.out.println("Rectangle color: " + rectangle.getColor()); // Output: Rectangle color: Red
        System.out.println("Circle color: " + circle.getColor()); // Output: Circle color: Blue
    }
}
