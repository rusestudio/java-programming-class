package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sortinput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Get input strings from the user
		System.out.println("Enter the number of strings:");
		int stringCount = scanner.nextInt();
		scanner.nextLine();  // Consume the newline

		List<String> strings = new ArrayList<>();
		System.out.println("Enter " + stringCount + " strings:");
		for (int i = 0; i < stringCount; i++) {
			strings.add(scanner.nextLine());
		}

		// Get input numbers from the user
		System.out.println("Enter the number of integers:");
		int numberCount = scanner.nextInt();

		List<Integer> numbers = new ArrayList<>();
		System.out.println("Enter " + numberCount + " integers:");
		for (int i = 0; i < numberCount; i++) {
			numbers.add(scanner.nextInt());
		}

		// Sort strings alphabetically using lambda expression (case-insensitive)
		strings.sort((str1, str2) -> str1.compareToIgnoreCase(str2));

		// Sort numbers in ascending order using lambda expression
		numbers.sort((num1, num2) -> num1.compareTo(num2));

		// Print sorted strings
		System.out.println("Sorted strings:");
		for (String str : strings) {
			System.out.print(str + " ");
		}

		// Print sorted numbers
		System.out.println("\nSorted numbers:");
		for (Integer num : numbers) {
			System.out.print(num + " ");
		}

		scanner.close();

	}}
