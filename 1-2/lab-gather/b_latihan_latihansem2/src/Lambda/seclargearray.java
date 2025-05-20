package Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class seclargearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an array of integers
		Integer[] nums = {
				1,
				7,
				18,
				25,
				77,
				300,
				101
		};
		System.out.println("Array elements: " + Arrays.toString(nums));
		// Find the second largest element using lambda expression
		Integer secondLargest = Arrays.stream(nums)
				.distinct()
				.sorted((a, b) -> b - a)
				.skip(1)
				.findFirst()
				.orElse(null);

		// Find the second smallest element using lambda expression
		Integer secondSmallest = Arrays.stream(nums)
				.distinct()
				.sorted((a, b) -> a - b)
				.skip(1)
				.findFirst()
				.orElse(null);

		// Print the results
		System.out.println("Second largest element: " + secondLargest);
		System.out.println("Second smallest element: " + secondSmallest);

	}

}
