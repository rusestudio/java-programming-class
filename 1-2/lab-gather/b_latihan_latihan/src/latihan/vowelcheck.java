package latihan;
import java.util.Scanner;

public class vowelcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter string:");
		String str = input.next();
		
		System.out.println("are all characters are vowel?");
		System.out.print(test(str));
		
	}
	
	public static boolean test(String input) {
		String str_vowels = "aeiou";
		String phrase = input.toLowerCase();
		
		for(int i =0; i< phrase.length(); i++) {
			if(str_vowels.indexOf(phrase.charAt(i))== -1)
				return false;
		}
		return true;
	}
	
	
	
	

}
