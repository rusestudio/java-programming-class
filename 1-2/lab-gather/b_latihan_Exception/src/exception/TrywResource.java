package exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class TrywResource {

	public static void main(String[] args) throws FileNotFoundException { //need to throw exception at method
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("item1");
		list.add("item2");
		list.add("item3");
		
		try (PrintWriter output = new PrintWriter("myoutput.txt")){ //printwriter is the resource 
			for( String s : list) {
				output.println(s.toLowerCase());
			}
			output.close();
		}

	}

}
