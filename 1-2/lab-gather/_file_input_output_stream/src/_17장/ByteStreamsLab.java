package _17장;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class ByteStreamsLab {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
        System.out.print("Enter the file name: ");
        String inputfilename = input.next();

        System.out.println("Copy file name: ");
        String outputfilename = input.next();
        
        try(InputStream inputStream = new FileInputStream(inputfilename);
        	OutputStream outputStream = new FileOutputStream(outputfilename)) {
        	int c;
        	
        	while ((c = inputStream.read())!=-1) {
        		outputStream.write(c);        
        	}
        	System.out.println(inputfilename + "- copied to:" + outputfilename );
        	
        }
	}

}
