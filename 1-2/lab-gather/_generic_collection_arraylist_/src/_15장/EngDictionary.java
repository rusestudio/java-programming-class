package _15장;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EngDictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> st = new HashMap<String, String>();
		
		st.put("map",  "지도");
		st.put("java", "자바");
		st.put("school","힉교");
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("enter word: ");
            String key = input.next();
            
            if(key.equals("quit"))break;
            System.out.println("meaning:"+ st.get(key));// find and print 
           
		}while(true);

	}

}
