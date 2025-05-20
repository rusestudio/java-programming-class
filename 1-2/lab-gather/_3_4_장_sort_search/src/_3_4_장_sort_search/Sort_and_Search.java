package _3_4_장_sort_search;
import java.util.Scanner;

public class Sort_and_Search {

	// Insertion Sort helper function to insert elements in the correct place
    public static void insert(int[] x, int i) {
        int temp = x[i];    // Store the value to insert
        int j = i - 1;

        // Find the correct location for temp in the sorted portion
        while (j >= 0 && temp < x[j]) {  
            x[j + 1] = x[j];  // Shift elements to the right
            j--;
        }
        x[j + 1] = temp;  // Place temp in its correct position
    }

    // Function to perform Insertion Sort
    public static void insertionSort(int[] x, int n) {
        for (int i = 1; i < n; i++)
            insert(x, i);
    }

    // Binary Search function
    public static int bsearch(int[] x, int n, int key) {
        int low = 0;
        int high = n - 1;
        int mid;

        while (high >= low) {
            mid = (high + low) / 2;

            if (key == x[mid])
                return mid;  // Key found
            if (key < x[mid])
                high = mid - 1;  // Narrow the search to the lower half
            else
                low = mid + 1;  // Narrow the search to the upper half
        }
        return -1;  // Key not found
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of data: ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        System.out.print("Enter " + size + " integers: ");
        for (int i = 0; i < size; i++)
            numbers[i] = input.nextInt();

        // Sorting the array
        insertionSort(numbers, size);

        System.out.print("Sorted: ");
        for (int i = 0; i < size; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();

        // Prompt user to enter a number to search
        System.out.print("Enter the number to search: ");
        int key = input.nextInt();

        // Perform Binary Search
        int result = bsearch(numbers, size, key);

        // Output the search result
        if (result != -1)
            System.out.println("Number " + key + " found at " + (result+1) + " position");
        else
            System.out.println("Number " + key + " not found.");
    }
}
