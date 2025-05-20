package _17장;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileReader inputStream = null;
		FileWriter outputStream = null;
		
		try {
			inputStream = new FileReader("input1.txt");
            outputStream = new FileWriter("output1.txt");
            
            int c;
            
            while((c = inputStream.read())!= -1) {
                outputStream.write(c);
            }
		}finally {
			if(inputStream!= null)
                inputStream.close();
            if(outputStream!= null)
                outputStream.close();
		}

	}

}
