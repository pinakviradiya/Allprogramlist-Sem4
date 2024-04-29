import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main10 {
    public static void main(String[] args) {
        String fileName = "myData.csv";

        try {
            // Read the file and update the age for "David Lee"
            updateAgeInCSV(fileName, "David Lee", 21);

            // Read and display the updated content of the file
            readFromFile(fileName);
        } catch (IOException e) {
            System.out.println("Error: Failed to update CSV file.");
            e.printStackTrace();
        }
    }

    private static void updateAgeInCSV(String fileName, String nameToUpdate, int newAge) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        StringBuilder fileContent = new StringBuilder();

        while ((line = bufferedReader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length >= 3 && parts[0].trim().equals(nameToUpdate)) {
                parts[1] = " " + newAge; // Update age
                line = String.join(",", parts);
            }
            fileContent.append(line).append("\n");
        }

        bufferedReader.close();

        // Write the updated content back to the file
        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(fileContent.toString());
        bufferedWriter.close();
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
