class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

class Calculator {
    public static double divide(int dividend, int divisor) throws DivideByZeroException {
        if (divisor == 0) {
            throw new DivideByZeroException("Error: Divide by zero!");
        }
        return (double) dividend / divisor;
    }
}

public class main3 {
    public static void main(String[] args) {
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");
        int dividend = 10;
        int divisor1 = 2;
        int divisor2 = 0;

        try {
            double result1 = Calculator.divide(dividend, divisor1);
            System.out.println("Result 1: " + result1);

            double result2 = Calculator.divide(dividend, divisor2);
            System.out.println("Result 2: " + result2);  // This line will throw DivideByZeroException
        } catch (DivideByZeroException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
