package fio;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;



public class storeimgandtext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
        FileInputStream readimg = null;
        DataOutputStream outf = null;

        try {
            // Open the image file to read
            readimg = new FileInputStream("6.JPG");
            // Create an output stream to write to the file
            outf = new DataOutputStream(new FileOutputStream("output.txt"));

            // Write text content
            System.out.print("Enter content for the text file: ");
            String content = input.nextLine();
            outf.writeUTF(content); // Write text content as UTF-8

            // Write image content
            byte[] buffer = new byte[1024]; // Buffer to read image in chunks
            int bytesRead;
            while ((bytesRead = readimg.read(buffer)) != -1) {
                outf.write(buffer, 0, bytesRead); // Write image data
            }

            System.out.println("Content and image written successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (readimg != null) {
                    readimg.close(); // Close image input stream
                }
                if (outf != null) {
                    outf.close(); // Close output stream
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

	}

}
