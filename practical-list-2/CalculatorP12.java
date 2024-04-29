public class CalculatorP12 {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        CalculatorP12 calculator = new CalculatorP12();
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");

        // Testing the calculator methods
        System.out.println("Addition: " + calculator.add(20, 5));
        System.out.println("Subtraction: " + calculator.subtract(20, 5));
        System.out.println("Multiplication: " + calculator.multiply(20, 5));
        System.out.println("Division: " + calculator.divide(20, 5));
    }
}