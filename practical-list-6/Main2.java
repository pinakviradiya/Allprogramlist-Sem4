import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "This is a sample text that will be written to the file.";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("File created and content written successfully.");
        } catch (IOException e) {
            System.out.println("Error: Failed to create file or write content.");
            e.printStackTrace();
        }
    }
}
