package _17장;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
	
	static String solution;
	static boolean check(String s, StringBuffer a, char ch) {
		
		int i;
		
		for(i=0; i<s.length(); i++) {
			if(s.charAt(i)==ch)
		    a.setCharAt(i,  ch);
		}
		for (i=0; i<s.length(); i++) 
			if(s.charAt(i)!= a.charAt(i))
					return false;
			return true;
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		char ch;
		Scanner input  = new Scanner(System.in);
		
		BufferedReader in = null;
		String[] words = new String[100];
		int count =0;
		
		in = new BufferedReader(new FileReader("sample.txt"));
		for(int i=0; i<100; i++) {
			String s = in.readLine();
			if(s ==null) 
			  break;
			words[i] = s;
			count++;
		}
			
		int index = (new Random()).nextInt(count);
		solution = words[index];
		
		StringBuffer answer = new StringBuffer(solution.length());
		for(int i =0; i< solution.length(); i++) 
			answer.append(' ');
		for(int i =0; i <solution.length(); i++) {
			if(solution.charAt(i) != ' ')
			answer.setCharAt(i, ' ');
		}
		
		while(true) {
			System.out.println("현재의 상태: " + answer);
			System.out.print("글자를 추측하시오: ");
			String c = input.next();
			
			if(check(solution, answer, c.charAt(0)) == true)
			 break;
		}
		
		System.out.println("현재의 상태: " + answer);
		
		
		
		
				
	}

}
