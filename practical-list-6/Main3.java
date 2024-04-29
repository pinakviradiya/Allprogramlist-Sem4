import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String initialContent = "Initial content of the file.";
        String modifiedContent = "Modified content of the file.";

        // Create the file and write initial content
        createAndWriteToFile(fileName, initialContent);

        // Read and display the content of the file
        readFromFile(fileName);

        // Modify the content of the file
        modifyFileContent(fileName, modifiedContent);

        // Read and display the modified content of the file
        readFromFile(fileName);
    }

    private static void createAndWriteToFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(content);
            bufferedWriter.close();
            System.out.println("File created and initial content written successfully.");
        } catch (IOException e) {
            System.out.println("Error: Failed to create file or write initial content.");
            e.printStackTrace();
        }
    }

    private static void readFromFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            System.out.println("\nReading content from the file:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error: Failed to read from file.");
            e.printStackTrace();
        }
    }

    private static void modifyFileContent(String fileName, String newContent) {
        try {
            FileWriter writer = new FileWriter(fileName, true); // Append mode
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("\n" + newContent); // Append new content
            bufferedWriter.close();
            System.out.println("File content modified successfully.");
        } catch (IOException e) {
            System.out.println("Error: Failed to modify file content.");
            e.printStackTrace();
        }
    }
}
