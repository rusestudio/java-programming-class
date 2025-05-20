package latihanarray;

public class removearrayvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {5,10,15,3,20,25};
		int length = array.length;
		
		for (int i = 0; i < length; i++) {
		    if (array[i] % 5 != 0) {
		        // Shift elements to the left
		        for (int j = i; j < length - 1; j++) {
		            array[j] = array[j + 1];
		        }
		        length--;  // Decrease the array length since we "removed" an element
		        i--;  // Adjust index to check the new element at this position
		    }
		}

		// Print the filtered array
		for (int i = 0; i < length; i++) {
		    System.out.println(array[i]);
		}
	}
}