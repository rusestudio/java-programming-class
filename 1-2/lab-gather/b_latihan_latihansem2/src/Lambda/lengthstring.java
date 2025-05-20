package Lambda;

import java.util.Arrays;
import java.util.List;

public class lengthstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a list of colors
		List < String > colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");

		// Print the elements of the list
		System.out.println("Elements of the list: " + colors);

		// Find the length of the longest string using lambda expression
		int max_length = colors.stream()
				.mapToInt(str -> str.length()) // Lambda expression
				.max()
				.orElse(0);

		// Print the length of the longest string
		System.out.println("Length of the longest string: " + max_length);

		// Find the length of the smallest string using lambda expression
		int min_length = colors.stream()
				.mapToInt(str -> str.length()) // Lambda expression
				.min()
				.orElse(0);

		// Print the length of the smallest string
		System.out.println("Length of the smallest string: " + min_length);

	}

}
