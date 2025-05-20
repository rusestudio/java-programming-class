
import java.util.Scanner;

public class pandaline2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String str = "", 
		reverseStr = "";
		
		System.out.print("enter a word:");
		str = input.next();
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + "  yes, is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " no is not a Palindrome String.");
	    }
	}

}
