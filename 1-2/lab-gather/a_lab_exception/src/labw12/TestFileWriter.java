package labw12;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("test_results.txt")) {
            writer.write("This is a test.\n");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
        }
    }
}
