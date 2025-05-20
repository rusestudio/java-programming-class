package exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileErrormethodcatch {
		
		private int[] list;
		private static final int SIZE=10;
		
		public FileErrormethodcatch() throws ArrayIndexOutOfBoundsException, IOException { //throw error in method
			list = new int[SIZE];
			for(int i =0; i< SIZE; i++) {
				list[i]=1; //list[i] will print 1 for all index
				writeList();
			}
		}
		
		private void writeList() throws ArrayIndexOutOfBoundsException ,IOException { //throw error in method
			// TODO Auto-generated method stub
			
			PrintWriter out = null;
				out = new PrintWriter(new FileWriter("outfilecatchmethod.txt")); //can have error write file
				for(int i=0; i < SIZE; i++)
					out.println("array index: "+ i + "=" + list[i]);  //can have index bound error
				out.close();
	        		
		}

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, IOException {
		// TODO Auto-generated method stub
           new FileErrormethodcatch();
	}

}
