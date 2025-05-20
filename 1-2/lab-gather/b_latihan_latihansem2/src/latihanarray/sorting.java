package latihanarray;

import java.util.Scanner;

class InsertionSort {
    // Function to insert elements into sorted part of the array
    public static void insert(int[] x, int i) {
        int temp = x[i];
        int j = i - 1;

        while (j >= 0 && temp < x[j]) {
            x[j + 1] = x[j];
            j--;
        }
        x[j + 1] = temp;
    }

    // Insertion sort function
    public static void insertionSort(int[] x, int n) {
        for (int i = 1; i < n; i++)
            insert(x, i);
    }

    // Binary search function
    public static int bsearch(int[] x, int n, int key) {
        int low = 0;
        int high = n - 1;
        int mid;

        while (high >= low) {
            mid = (high + low) / 2;
            if (key == x[mid])
                return mid;  // Return index if found
            if (key < x[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;  // Return -1 if not found
    }
}

public class sorting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter data size: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        // Input array elements
        System.out.print("Enter the data (positive integers only): ");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
            if (numbers[i] < 0) {
                System.out.println("Enter only positive numbers");
                return;  // Exit if a negative number is input
            }
        }

        // Sort the array
        InsertionSort.insertionSort(numbers, size);

        // Print sorted array
        System.out.print("Sorted: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Input the number to be searched
        System.out.print("Enter number to be searched: ");
        int target = input.nextInt();

        // Perform binary search
        int index = InsertionSort.bsearch(numbers, size, target);

        // Output search result
        if (index != -1) {
            System.out.println("Number found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
    }
}
