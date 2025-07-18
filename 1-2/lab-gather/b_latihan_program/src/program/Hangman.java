package program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(new File("KNU.txt"));
		Scanner input = new Scanner(System.in);
		
		List<String> words = new ArrayList<String>();
		
		//check file not empty or null
		//while(scanner.hasNext()) {
			//System.out.println(scanner.nextLine());
		//}

		while (scanner.hasNext()) {
			words.add(scanner.nextLine());
		}
		
		Random rand = new Random();
		
		String word = words.get(rand.nextInt(words.size())); //rand from 0~ size of list in file
		
		System.out.println(word);
		
		List<Character> playerGuesses = new ArrayList<>();
		
		
		int wrongCount = 0;
		
		while(true) {
		printHangMan(wrongCount);
		
		if(wrongCount>=6) {
			System.out.println("u lose!");
            break;
		}
			
			
		printWordState(word, playerGuesses);
		if (!getPlayerGuess(input, word, playerGuesses)) {
			wrongCount++;
		}

		if(printWordState(word, playerGuesses)) {
			System.out.println("u win!");
			break;
		}
		
		System.out.println("enter your guess word:");
		if(input.nextLine().equals(word)){
			System.out.println("u win!");
			break;
		}	else {
			System.out.println("wrong guess! try again");
		}
		
		}
		
	}

	private static void printHangMan(int wrongCount) {
		System.out.println("  -------  ");
		System.out.println("  |      |");
		if (wrongCount >=1) {
			System.out.println("  O");
		}
		
		if(wrongCount >=2) {
			System.out.print(" \\ ");
			if(wrongCount >=3) {
				System.out.println(" /");
			} else {
				System.out.println("");
			}
		}
		if (wrongCount >=4) {
			System.out.println("  |");
		}
		if(wrongCount >=5) {
			System.out.print(" / ");
			if(wrongCount >=6) {
				System.out.println(" \\");
			} else {
				System.out.println("");
			}
		}
		System.out.print("");
		System.out.print("");
	}

	private static boolean getPlayerGuess(Scanner input, String word, List<Character> playerGuesses) {
		System.out.println("enter letter:");
		String letterGuess = input.nextLine();
		playerGuesses.add(letterGuess.charAt(0));
		
		return word.contains(letterGuess);

	}

	private static boolean printWordState(String word, List<Character> playerGuesses) {
		int correctCount =0;
		
		for(int i =0; i <word.length(); i++) {
			if(playerGuesses.contains(word.charAt(i))) {
				System.out.print(word.charAt(i)); //if guess print the char
				correctCount++;
			} else {
				System.out.print("_ "); //else print _
			}
		}
		System.out.println();
		
		return (word.length()== correctCount);
	}

}
