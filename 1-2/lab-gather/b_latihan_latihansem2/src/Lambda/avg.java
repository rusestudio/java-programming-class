package Lambda;

import java.util.Arrays;
import java.util.List;

public class avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//list double
		List<Double> number = Arrays.asList(3.5, 7.5, 4.3, 4.7, 5.1);
		
		//print list
		System.out.println("ori list of number:");
		
		 // Calculate average using lambda expression
        double avg = number.stream()
                .mapToDouble(n -> n) // Lambda expression here
                .average()
                .orElse(0.0);
		
		//print avg result
		System.out.println("avg is:"+ avg);

	}

}
