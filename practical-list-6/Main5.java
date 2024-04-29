import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main5 {
    public static void main(String[] args) {
        String fileName = "myFile.txt";

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

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
}
