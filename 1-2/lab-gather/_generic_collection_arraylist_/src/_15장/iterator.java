package _15장;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list2 = new ArrayList<String>();
		
		List<String> list = Arrays.asList(new String[3]); //change array to list
		
		list2.add("하나");
		list2.add("둘");
		list2.add("셋");
		list2.add("넷");
		
		String s;
		Iterator e =list2.iterator(); 
		
		while(e.hasNext()) {   //e.hasNext()- return next element in iteration
			s = (String)e.next();
			System.out.println(s);
	}

}
}