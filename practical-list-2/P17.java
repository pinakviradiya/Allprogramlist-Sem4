public class P17 {
    public static void main(String[] args) {
        // Creating an instance of the CalculatorP12 class
        CalculatorP12 calculator = new CalculatorP12();

        // Testing the calculator methods
        int sum = calculator.add(10, 5);
        int difference = calculator.subtract(10, 5);
        int product = calculator.multiply(10, 5);
        int quotient = calculator.divide(10, 5);

        // Printing out the results
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");
        // Creating an instance of the PersonP13 class
        PersonP13 person = new PersonP13("Bakki Hanma", 22, "Tokyo");

        // Testing the person methods
        person.introduce();
        person.setName("Yuujiro Hanma");
        person.setAge(80);
        person.setAddress("Tokyo");
        person.introduce();

    }
}

