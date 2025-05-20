package exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Custom exception classes
class FileOpenFailed extends Exception {}
class SizeDeterminationFailed extends Exception {}
class MemoryAllocationFailed extends Exception {}
class ReadFailed extends Exception {}
class FileCloseFailed extends Exception {}

public class FileCatchError {

    public static void main(String[] args) {
        PrintWriter myfile = null;

        try {
            // Open file
            if (!simulateCondition()) {
                throw new FileOpenFailed();
            }
            myfile = new PrintWriter(new FileWriter("myfile.txt"));

            // Determine file size
            if (!simulateCondition()) {
                throw new SizeDeterminationFailed();
            }

            // Allocate memory
            if (!simulateCondition()) {
                throw new MemoryAllocationFailed();
            }

            // Write to the file
            if (!simulateCondition()) {
                throw new ReadFailed();
            }
            myfile.println("This is my file");

            // Simulate file close failure
            if (!simulateCondition()) {
                throw new FileCloseFailed();
            }

        } catch (FileOpenFailed e) {
            System.err.println("File Open Failed");
        } catch (SizeDeterminationFailed e) {
            System.err.println("Size Determination Failed");
        } catch (MemoryAllocationFailed e) {
            System.err.println("Memory Allocation Failed");
        } catch (ReadFailed e) {
            System.err.println("Read Failed");
        } catch (FileCloseFailed e) {
            System.err.println("File Close Failed");
        } catch (IOException e) {
            System.err.println("IOException occurred");
        } finally {
            if (myfile != null) {
                myfile.close(); // Ensure the file is closed
                System.out.println("File closed successfully.");
            }
        }
    }

    // Simulate random condition to trigger exceptions
    private static boolean simulateCondition() {
        return Math.random() > 0.2; // 80% chance of success
    }
}
