public class Main5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Trying to access an element outside the array's bounds
            int index = 10;
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching the ArrayIndexOutOfBoundsException
            System.out.println("Pinak viradiya");
		System.out.println("220130318014");
            System.out.println("Caught an ArrayIndexOutOfBoundsException.");
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}
