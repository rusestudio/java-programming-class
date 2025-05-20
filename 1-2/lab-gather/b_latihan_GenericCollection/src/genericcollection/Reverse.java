package genericcollection;

import java.util.ArrayList;
import java.util.List;

public class Reverse {
	
	public static <T> List <T> reverseList (List <T> element) {
		
		List <T> reversedList = new ArrayList< >();
		
		for(int i = element.size() -1 ; i >= 0; i--) {
			reversedList.add(element.get(i));
		}
		return reversedList;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> num1 = List.of(1,2,3,4,5,6);
		List <String> str1 = List.of("red","green","yellow");
				
	    List <Integer> reverseNum = reverseList(num1);
	    System.out.println("original list: " + num1);
	    System.out.println("reversed list: " + reverseNum);
	    
	    List <String> reverseStr = reverseList(str1);
	    System.out.println("original list: " + str1);
	    System.out.println("reversed list: " + reverseStr);
	    
	}

}
