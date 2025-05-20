package fio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class findlongestword {

	public static void main(String[] args) throws FileNotFoundException {
        		// TODO Auto-generated method stub
		
		  new findlongestword().findLongestWords();
	}

	private String findLongestWords() throws FileNotFoundException{
		// TODO Auto-generated method stub
		 String longest_word = "";
	       String current;
	       Scanner sc = new Scanner(new File("KNU.txt"));


	       while (sc.hasNext()) {
	          current = sc.next();
	           if (current.length() > longest_word.length()) {
	             longest_word = current;
	           }

	       }
	         System.out.println("\n"+longest_word+"\n");
	            return longest_word;
	}}
