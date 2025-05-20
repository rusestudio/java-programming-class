package Lambda;

import java.util.Arrays;
import java.util.List;

public class sortstringalphabetical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // Create a list of colors
        List<String> colors = Arrays.asList("red", "green", "blue", "black", "pink");

        // Print original list
        System.out.println("Original string:");
        for (String str : colors) {
            System.out.print(str + " ");
        }
        
        // Sort list in alphabetical order (case-insensitive)
        colors.sort((str1, str2) -> str1.compareToIgnoreCase(str2));
        
        // Print sorted list
        System.out.println("\nSorted string:");
        for (String str : colors) {
            System.out.print(str + " ");
		}

	}

}
