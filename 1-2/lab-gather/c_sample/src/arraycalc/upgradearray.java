package arraycalc;

public class upgradearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare and initialize an array of integers
        int[] numbers = {5, 10, 15, 20, 25};

        // Access and print the elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Update an element of the array
        numbers[2] = 30;

        // Access and print the updated element
        System.out.println("Updated element: " + numbers[2]);

        // Calculate and print the sum of all elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of all elements: " + sum);
	}

}
