package Lambda;

import java.util.Arrays;
import java.util.List;

public class avgstringlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> colors = Arrays.asList("Red", "Black", "White", "Orange", "Blue");
		System.out.println("List of colors: " + colors);

		double averageLength = calculateAverageLength(colors);
		System.out.println("Average length of colors(strings): " + averageLength);
	}

	public static double calculateAverageLength(List < String > strings) {
		return strings.stream()
				.mapToInt(str -> str.length()) // Convert each string to its length
				.average() // Calculate the average
				.orElse(0); // If the list is empty, return 0 as the default value

	}

}
