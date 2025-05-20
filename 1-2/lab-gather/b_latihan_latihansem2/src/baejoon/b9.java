package baejoon;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class b9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initialize scanner for input
        Scanner input = new Scanner(System.in);
        
        // Create a set to store unique remainders
        Set<Integer> remainders = new HashSet<>();
        
        // Read 10 numbers and compute their remainders when divided by 42
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();
            int remainder = number % 42;  // Fixed typo here
            remainders.add(remainder);    // Now uses the correct variable name
        }
        
        // Output the number of distinct remainders
        System.out.println(remainders.size());
		

	}

}
