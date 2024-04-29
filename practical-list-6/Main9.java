import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main9 {
    public static void main(String[] args) {
        String fileName = "myData.csv";

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error: Failed to read from CSV file.");
            e.printStackTrace();
        }
    }
}
