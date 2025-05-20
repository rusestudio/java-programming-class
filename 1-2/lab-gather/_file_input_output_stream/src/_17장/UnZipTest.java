package _17장;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZipTest {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("enter zip file name: ");
		 String inname = input.next();
		 System.out.print("enter original file name: ");
		 String outname = input.next();
		 
		 ZipInputStream inStream = new ZipInputStream(
				 				   new FileInputStream(inname));
         OutputStream outStream = new FileOutputStream(outname);
         
         byte[] buffer = new byte[1024];
         
         int read;
         ZipEntry entry;
         if((entry = inStream.getNextEntry()) != null) {
        	 while((read = inStream.read(buffer))> 0) {
                 outStream.write(buffer, 0, read);
             }
             outStream.close();
             inStream.close();
         };
	}

}
