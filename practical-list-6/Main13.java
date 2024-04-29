import java.io.File;

public class Main13 {
    public static void main(String[] args) {
        String directoryName = "myDirectory";
        String fileName = "myFile.txt";

        File directory = new File(directoryName);
        File file = new File(fileName);

        // Create the directory if it doesn't exist
        if (!directory.exists()) {
            if (directory.mkdir()) {
                System.out.println("Directory created successfully.");
            } else {
                System.out.println("Error: Failed to create the directory.");
                return;
            }
        }

        // Move the file into the directory
        File newFile = new File(directory, file.getName());
        if (file.renameTo(newFile)) {
            System.out.println("File moved successfully.");
        } else {
            System.out.println("Error: Failed to move the file.");
        }
    }
}
