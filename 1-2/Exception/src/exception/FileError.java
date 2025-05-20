package exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileError {
	
	private int[] list;
	private static final int SIZE=10;
	
	public FileError() {
		list = new int[SIZE];
		for(int i =0; i< SIZE; i++) {
			list[i]=1;
			writeList();
		}
	}
	
	private void writeList() {
		// TODO Auto-generated method stub
		
		PrintWriter out = null;
		
		try {
			out = new PrintWriter(new FileWriter("outfile.txt")); //can have error write file
			for(int i=0; i < SIZE; i++)
				out.println("array index: "+ i + "=" + list[i]);  //can have index bound error
		} catch ( ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsException"); //catch index error
		} catch ( IOException e) {
			System.err.println("IOException"); //catch input output file error
        } finally {
        	if (out != null) // 실행 when try block 종료. return source
        		out.close();
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new FileError();
	}

}
