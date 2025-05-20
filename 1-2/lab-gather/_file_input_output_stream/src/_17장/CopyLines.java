package _17장;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLines {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		
		try {
			inputStream = new BufferedReader(new FileReader("input2.txt"));
            outputStream = new PrintWriter(new FileWriter("output2.txt"));
            
            String l;
 
            while((l = inputStream.readLine())!=null) {
                outputStream.println(l);
            }
		}finally {
			if (inputStream != null) {
				inputStream.close();
			}
			
            if (outputStream != null) {
                outputStream.close();
            }
		}

	}

}
