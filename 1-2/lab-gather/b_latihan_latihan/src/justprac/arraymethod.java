package justprac;

import java.util.Arrays;

//Method	Description
//compare()	Compares two arrays
//copyOf()	Creates a copy of an array with a new length
//deepEquals()	Compares two multidimensional arrays to check whether they are deeply equal to each other
//equals()	Checks if two arays are equal
//fill()	Fills an array with a specified value
//mismatch()	Returns the index position of the first mismatch/conflict between two arrays
//sort()	Sorts an array in ascending order

public class arraymethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"Volvo", "BMW", "Tesla"};
		String[] cars2 = {"Volvo", "BMW", "Tesla"};

		System.out.println(Arrays.equals(cars, cars2)); 
	}

}
