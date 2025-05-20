package latihanarray;

import java.util.Scanner;

public class arraysame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize the array with the given size
        int[] array = new int[size];

        // Take input for the array elements
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Ask the user for the number to search in the array
        System.out.print("Enter the number to count in the array: ");
        int n = scanner.nextInt();

        // Count occurrences of the number n
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                count++;
            }
        }

        // Print the result
        System.out.println("Count of " + n + " in the array: " + count);

		
	}

}
