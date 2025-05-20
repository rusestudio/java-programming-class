package labw3;
import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		
		String word = "";
		String[] longword = new String[10000]; //store 1000 cahrs
		int max = 0; 
		int wordCount = 0; 

		System.out.print("문자열 입력: ");
		String sentence = input.nextLine();
		sentence += " "; // add spcea
		
		int lg = sentence.length();

		for (int i = 0; i < lg; i++) {
			char chr = sentence.charAt(i);
			if (chr == ' ') {
				if (word.length() > max) {
					max = word.length();
					longword = new String[10000];
					longword[0] = word; 
					wordCount = 1;
					
				} else if (word.length() == max) {
					longword[wordCount] = word;
					wordCount++;
				}
				word = ""; 
			} else {
				word += chr;
			}
		}

		System.out.print("가장 긴 단어들: "); //print word
		for (int i = 0; i < wordCount; i++) {
		    boolean same = false;

		    for (int j = 0; j < i; j++) { //check same or not
		        if (longword[i].equals(longword[j])) {
		            same = true;
		            break;
		        }
		    }
		    if (!same) {
		        System.out.print(longword[i].toLowerCase() + " ");
		    }
		}


}}