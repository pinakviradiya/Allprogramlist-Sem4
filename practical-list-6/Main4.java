import java.io.FileWriter;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) {
        String fileName = "myFile.txt";
        String content = "Hello World!";

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
