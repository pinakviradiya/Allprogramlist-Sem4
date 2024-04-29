import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file name:");
        String fileName = scanner.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            System.out.println("File content:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Pinak viradiya");
		    System.out.println("220130318014");
            System.out.println("Error: File not found.");
        }

        scanner.close();
    }
}
