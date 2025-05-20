package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removedups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Create a list of integers with duplicates
        List<Integer> nums = Arrays.asList(1, 2, 3, 3, 4, 3, 2, 5, 6, 1, 7, 7, 8, 10);
        
        // Print the list
        System.out.println("List elements " + nums);     
       
        // Remove duplicates using lambda expression
        List<Integer> unique_nums = new ArrayList<>();
        nums.stream()
                .distinct()
                .forEach(n-> unique_nums.add(n));

        // Print the list without duplicates
        System.out.println("\nList elements without duplicates: " + unique_nums);

	}

}
