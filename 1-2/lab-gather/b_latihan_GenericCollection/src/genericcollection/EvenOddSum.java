package genericcollection;

import java.util.List;

public class EvenOddSum {
	
	public static <T extends Number> void calculateNumberSum(List <T> numbers) {
		
		double evenSum = 0;
		double oddSum = 0;
		
		for( T number: numbers) {
			if(number.doubleValue() % 2 ==0) {
				evenSum = evenSum + number.doubleValue();
			} else {
				oddSum = oddSum + number.doubleValue();
			}
		}
		System.out.println("original list of number: " + numbers);
		System.out.println("sum of even number: " + evenSum);
		System.out.println("sum of odd number: "+ oddSum);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> integers = List.of(1,2,3,4,5,6,7);
		List <Double> doubles = List.of(2.0, 1.5, 4.5, 2.5, 1.5);
		
		calculateNumberSum(integers);
		calculateNumberSum(doubles);

	}

}
