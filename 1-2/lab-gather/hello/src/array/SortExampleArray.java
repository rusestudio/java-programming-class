package array;
import java.util.Arrays; // import array library

public class SortExampleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int SIZE = 10;
		int[] numbers = new int[SIZE]; // array size refer to SIZE
		
		for (int i = 0; i < SIZE; i++) { //SIZE 만큼 반복
			int r = (int) (Math.random()*100); //0.0<= 1.0 / 0.0< 100.0
			numbers[i] =r;
			
			
		}

		System.out.print("최초의 리스트:");
		
		for (int r : numbers)    // for each number random
			System.out.print(r + " ");
		Arrays.sort(numbers);     // sort array
		
		System.out.print("\n정렬된 리스트:"); 
		for (int r : numbers)      // use for each number to print
			System.out.print(r +" "); // print sorted array result
		
		
	}

}
