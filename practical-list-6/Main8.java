import java.io.FileWriter;
import java.io.IOException;

public class Main8 {
    public static void main(String[] args) {
        String fileName = "myData.csv";
        String[] headers = {"Name", "Age", "Gender"};
        String[] data = {"John Doe, 25, Male", "John Smith, 30, Female", "David Lee, 20, Male"};

        try {
            FileWriter writer = new FileWriter(fileName);

            // Write headers
            for (int i = 0; i < headers.length; i++) {
                writer.append(headers[i]);
                if (i < headers.length - 1) {
                    writer.append(',');
                } else {
                    writer.append('\n');
                }
            }

            // Write data
            for (String row : data) {
                writer.append(row).append('\n');
            }

            writer.close();
            System.out.println("CSV file created and data written successfully.");
        } catch (IOException e) {
            System.out.println("Error: Failed to create CSV file or write data.");
            e.printStackTrace();
        }
    }
}
