package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;


interface SumCalculator {
    int sum(int a, int b);
}

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. sum
		  SumCalculator sumCalculator = (x, y) -> x + y;
	        int result = sumCalculator.sum(7, 6);
	        System.out.println("Sum 7,6): " + result);
		result = sumCalculator.sum(15, -35);
	        System.out.println("Sum 15, -35): " + result);
	        
	   //2.check string empty
	     // Lambda expression to check if a given string is empty
	        Predicate isEmptyString = str -> ((String) str).isEmpty();
	        // Test cases
	        String str1 = ""; // empty string
	        String str2 = "Java lambda expression!"; // non-empty string
	        // Check if the strings are empty using the lambda expression
			System.out.println("String 1:" + str1);
	        System.out.println("String 1 is empty: " + isEmptyString.test(str1));
	        System.out.println("\nString 2:" + str2);
			System.out.println("String 2 is empty: " + isEmptyString.test(str2));
	    
			
	   //3.convert upper case to lower case
			 // Create a list of strings
	        List<String> stringList = Arrays.asList("Red", "Green", "Blue", "PINK");
	        // Print the original strings
	        System.out.println("\nOriginal strings:");
	        for (String str : stringList) {
	            System.out.println(str);
	        } 
	        // Convert strings to lowercase using lambda expression
	        stringList.replaceAll(str -> str.toLowerCase());
	        // Print the list of lowercase strings
	        System.out.println("\nLowercase strings:");
	        for (String str : stringList) {
	            System.out.println(str);
	        }			
			// Convert strings to uppercase using lambda expression
	        stringList.replaceAll(str -> str.toUpperCase());
	        // Print the list of uppercase strings
	        System.out.println("\nUppercase strings:");
	        for (String str : stringList) {
	            System.out.println(str);
	        }
	        
	  //4.filter oddeven
	     // Create a list of integers
	        List<Integer> nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);	        
			// Print the original numbers
	        System.out.println("Original numbers:");
	        for (int n : nums) {
	            System.out.print(n+ " ");
	        }		
	        // Filter out even numbers using lambda expression
	        List <Integer>evenNumbers = nums.stream()
	                .filter(n -> n % 2 == 0)
	                .collect(Collectors.toList());
	        // Print the even numbers
	        System.out.print("\nEven numbers:");
	        for (int num : evenNumbers) {
	            System.out.print(num + " ");
	        }
	        // Filter out odd numbers using lambda expression
	        List <Integer>oddNumbers = nums.stream()
	                .filter(num -> num % 2 != 0)
	                .collect(Collectors.toList());
	        // Print the odd numbers
	        System.out.print("\nOdd numbers:");
	        for (int num : oddNumbers) {
	            System.out.print(num + " ");
	        }
	        
	  //5. sort string alphabetical
	        // Create a list of strings
	        List<String> colors = Arrays.asList("red", "green", "blue", "black", "pink");
	        // Print the Original list of strings
	        System.out.println("Original strings:");
	        for (String str : colors) {
	            System.out.print(str + ' ');
	        }
	        // Sort the list of strings in alphabetical order using lambda expression
	        colors.sort((str9, str8) -> str9.compareToIgnoreCase(str8));
	        // Print the sorted list of strings
	        System.out.println("\nSorted strings:");
	        for (String str : colors) {
	            System.out.println(str + ' ');
	        }
	    
	   //4.average of list
	     // Create a list of doubles
	        List<Double> nums5 = Arrays.asList(3.5, 7.5, 4.3, 4.7, 5.1);
			// Print the list elements
	        System.out.println("Original values: " + nums5);
	        // Calculate the average of the list using lambda expression
	        double average = nums5.stream()
	                .mapToDouble(Double::doubleValue)
	                .average()
	                .orElse(0.0);
	        // Print the average
	        System.out.println("\nAverage of the original values: " + average);
	    
	   //5.remove duplicate values
	        // Create a list of integers with duplicates
	        List<Integer> nums6 = Arrays.asList(1, 2, 3, 3, 4, 3, 2, 5, 6, 1, 7, 7, 8, 10);
	        // Print the list
	        System.out.println("List elements " + nums6);     
	        // Remove duplicates using lambda expression
	        List<Integer> unique_nums = new ArrayList<>();
	        nums6.stream()
	                .distinct()
	                .forEach(unique_nums::add);
	        // Print the list without duplicates
	        System.out.println("\nList elements without duplicates: " + unique_nums);
	    

	   //6. calculate factorial
	     // Define the factorial lambda expression
	        LongUnaryOperator factorial = n -> {
	            long resultf = 1;
	            for (long i = 1; i <= n; i++) {
	                resultf *= i;
	            }
	            return resultf;
	        };
	        // Calculate the factorial of a number using the lambda expression
	        long n = 7;
	        long factorial_result = factorial.applyAsLong(n);
	        // Print the factorial result
	        System.out.println("Factorial of " + n + " is: " + factorial_result);
	        
	   //7.check if prime
	     // Define the prime check lambda expression
	        Predicate<Integer> is_Prime = np -> {
	            if (np <= 1) {
	                return false;
	            }
	            for (int i = 2; i <= Math.sqrt(np); i++) {
	                if (np % i == 0) {
	                    return false;
	                }
	            }
	            return true;
	        };
	        // Check if a number is prime using the lambda expression
	        int nl = 17;
	        boolean isPrimeResult = is_Prime.test(nl);
	        // Print the prime check result
	        System.out.println(nl + " is prime? " + isPrimeResult);
			// Check if a number is prime using the lambda expression
	        nl = 15;
	        isPrimeResult = is_Prime.test(nl);
	        // Print the prime check result
	        System.out.println("\n"+nl + " is prime? " + isPrimeResult);
	        
	   //8. concate 2 string
	     // Define the concatenate lambda expression
	        BiFunction<String, String, String> concatenate = (strj, strk) -> strj + strk;
	        // Concatenate two strings using the lambda expression
	        String string1 = "Good ";
	        String string2 = "Morning!";
			System.out.println("Original strings: " + string1 + ", " +string2);
	        String resultc = concatenate.apply(string1, string2);
	        // Print the concatenated string
	        System.out.println("\nConcatenated string: " + resultc);
	        
	  //9. find min max
	        // Create a list of integers
	        List<Integer> numsm = Arrays.asList(12, 15, 0, 8, 7, 9, -6);
	        System.out.println("Original values of the said array: "+numsm); 
	        // Find the maximum value using lambda expression
	        Optional<Integer> max = numsm.stream()
	                .max((x, y) -> x.compareTo(y));

	        // Find the minimum value using lambda expression
	        Optional<Integer> min = numsm.stream()
	                .min((x, y) -> x.compareTo(y));

	        // Print the maximum and minimum values
	        System.out.println("Maximum value: " + max.orElse(null));
	        System.out.println("Minimum value: " + min.orElse(null));
	    
	}

}
