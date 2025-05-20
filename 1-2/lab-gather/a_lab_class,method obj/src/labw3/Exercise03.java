package labw3;
import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        // Scanner to take input from user
        Scanner input = new Scanner(System.in);

        String word = "";
        String[] longword = new String[10000]; // Store up to 1000 words
        int max = 0; 
        int wordCount = 0; 

        System.out.print("문자열 입력: ");
        String sentence = input.nextLine();
        sentence += " "; // Add space to ensure the last word is processed

        int lg = sentence.length();

        // Loop through each character in the input sentence
        for (int i = 0; i < lg; i++) {
            char chr = sentence.charAt(i);
            if (chr == ' ') {
                // When a space is encountered, check the length of the current word
                if (word.length() > max) {
                    max = word.length();
                    longword = new String[10000]; // Reset the array if a longer word is found
                    longword[0] = word; 
                    wordCount = 1;
                } else if (word.length() == max) {
                    longword[wordCount] = word;
                    wordCount++;
                }
                word = ""; // Reset word to start collecting next word
            } else {
                word += chr;
            }
        }

        // Output the longest words, ensuring no duplicate words (case-insensitive)
        System.out.print("가장 긴 단어들: ");
        for (int i = 0; i < wordCount; i++) {
            boolean same = false;

            // Check if the word has already been printed (case-insensitive)
            for (int j = 0; j < i; j++) {
                if (longword[i].toLowerCase().equals(longword[j].toLowerCase())) {
                    same = true;
                    break;
                }
            }

            // If the word hasn't been printed, print it
            if (!same) {
                System.out.print(longword[i].toLowerCase() + " ");
            }
        }

        input.close();
    }
}
