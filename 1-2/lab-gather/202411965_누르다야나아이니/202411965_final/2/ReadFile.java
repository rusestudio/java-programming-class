package q2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//read input.txt
		//sort descending //Collection.sort()
		//write output.txt
		//add handle exception
		
		BufferedReader bufferedreader = null;
		PrintStream out = null;
        Double line = 0.0;
        List<Double> list = new ArrayList<Double>();
		
		try {			
			 BufferedReader file = new BufferedReader(new FileReader("input.txt"));
			 
			 out = new PrintStream("output.txt");
			 
             while (line !=0.0)
              {
               line = (double) file.read();
               if (line==0.0)
                  break;
               list.add(line); //arraylist
               Collections.sort(list);
				 Collections.reverse(list);
				 out.println(list); 
	             out.flush();
           }
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(bufferedreader!= null) bufferedreader.close();
            if(out!= null) out.close();
		}

	}

}
