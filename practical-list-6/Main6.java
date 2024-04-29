import java.io.FileWriter;
import java.io.IOException;

public class Main6 {
    public static void main(String[] args) {
        String fileName = "myFile.txt";
        String newLine = "\nJava Programming is awesome!";

        try {
            FileWriter writer = new FileWriter(fileName, true); // true for append mode
            writer.write(newLine);
            writer.close();
            System.out.println("New line appended to the file.");
        } catch (IOException e) {
            System.out.println("Error: Failed to append new line to the file.");
            e.printStackTrace();
        }
    }
}
