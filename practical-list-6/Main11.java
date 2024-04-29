import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main11 {
    public static void main(String[] args) {
        String fileName = "myData.csv";

        try {
            // Read and display the updated content of the file
            readFromFile(fileName);
        } catch (IOException e) {
            System.out.println("Error: Failed to read CSV file.");
            e.printStackTrace();
        }
    }

    private static void readFromFile(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
