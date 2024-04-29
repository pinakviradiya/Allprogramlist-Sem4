// Define the Shape class with a constructor and getInfo() method
class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getInfo() {
        return "Color: " + color;
    }
}

// Define a subclass Rectangle that extends Shape
class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Width: " + width + ", Height: " + height;
    }
}

// Define a subclass Circle that extends Shape
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Radius: " + radius;
    }
}

// Main class to test the Shape and its subclasses
public class MainP12 {
    public static void main(String[] args) {
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");
        Rectangle rectangle = new Rectangle("Red", 10, 5);
        Circle circle = new Circle("Blue", 7.5);

        System.out.println(rectangle.getInfo()); // Output: Color: Red, Width: 10, Height: 5
        System.out.println(circle.getInfo()); // Output: Color: Blue, Radius: 7.5
    }
}
