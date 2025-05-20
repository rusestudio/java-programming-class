package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public class lamb4 {
	
	//1.
	 public static boolean checkCase(List < String > strings, Predicate < String > checkFunction, Function < String, String > convertFunction) {
		    String firstString = strings.get(0);
		    String convertedString = convertFunction.apply(firstString);

		    return strings.stream()
		      .allMatch(s -> checkFunction.test(s));
		}
	 
	 //2.
	 public static double calculateAverageLength(List < String > strings) {
		    return strings.stream()
		      .mapToInt(String::length) // Convert each string to its length
		      .average() // Calculate the average
		      .orElse(0); // If the list is empty, return 0 as the default value
		  }
	 
	 //3.
	 public static long findLargestPrimeFactor(long n) {
		    for (long i = (long) Math.sqrt(n); i >= 2; i--) {
		      if (n % i == 0 && isPrime(i)) {
		        return i;
		      }
		    }
		    return n;
		  }

		  public static boolean isPrime(long number) {
		    return LongStream.rangeClosed(2, (long) Math.sqrt(number))
		      .allMatch(n -> number % n != 0);
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. check string upper lower or mixed
		List < String > strings = Arrays.asList("Java", "JAVA", "java");
	    System.out.println("Array elements: " + strings);
	    // Check if the list is all uppercase using lambda expression
	    boolean isAllUppercase = checkCase(strings, s -> s.equals(s.toUpperCase()), String::toUpperCase);
	    System.out.println("Is all uppercase? " + isAllUppercase);

	    // Check if the list is all lowercase using lambda expression
	    boolean isAllLowercase = checkCase(strings, s -> s.equals(s.toLowerCase()), String::toLowerCase);
	    System.out.println("Is all lowercase? " + isAllLowercase);

	    // Check if the list is mixed case
	    boolean isMixedCase = !isAllUppercase && !isAllLowercase;
	    System.out.println("Is mixed case? " + isMixedCase);

	    List < String > strings1 = Arrays.asList("JAVA", "PYTHON", "ABC");
	    System.out.println("\nArray elements: " + strings1);
	    // Check if the list is all uppercase using lambda expression
	    isAllUppercase = checkCase(strings1, s -> s.equals(s.toUpperCase()), String::toUpperCase);
	    System.out.println("Is all uppercase? " + isAllUppercase);

	    // Check if the list is all lowercase using lambda expression
	    isAllLowercase = checkCase(strings1, s -> s.equals(s.toLowerCase()), String::toLowerCase);
	    System.out.println("Is all lowercase? " + isAllLowercase);

	    // Check if the list is mixed case
	    isMixedCase = !isAllUppercase && !isAllLowercase;
	    System.out.println("Is mixed case? " + isMixedCase);

	    List < String > strings2 = Arrays.asList("java");
	    System.out.println("\nArray elements: " + strings2);
	    // Check if the list is all uppercase using lambda expression
	    isAllUppercase = checkCase(strings2, s -> s.equals(s.toUpperCase()), String::toUpperCase);
	    System.out.println("Is all uppercase? " + isAllUppercase);

	    // Check if the list is all lowercase using lambda expression
	    isAllLowercase = checkCase(strings2, s -> s.equals(s.toLowerCase()), String::toLowerCase);
	    System.out.println("Is all lowercase? " + isAllLowercase);

	    // Check if the list is mixed case
	    isMixedCase = !isAllUppercase && !isAllLowercase;
	    System.out.println("Is mixed case? " + isMixedCase);
	    
	    
	    //2. find average length of strings in a list.
	    List <String> colors = Arrays.asList("Red", "Black", "White", "Orange", "Blue");
	    System.out.println("List of colors: " + colors);

	    double averageLength = calculateAverageLength(colors);
	    System.out.println("Average length of colors(strings): " + averageLength);
	  

	  //3. find largest prime factor
	    int n = 176;
	    System.out.println("Number: " + n);

	    long largestPrimeFactor = findLargestPrimeFactor(n);
	    System.out.println("Largest prime factor: " + largestPrimeFactor);
	    n = 36;
	    System.out.println("\nNumber: " + n);

	    largestPrimeFactor = findLargestPrimeFactor(n);
	    System.out.println("Largest prime factor: " + largestPrimeFactor);


	   //4. convert binary
	    int nb = 33;
	    System.out.println("Number: " + nb);

	    Function < Integer, String > convertToBinary = num -> Integer.toBinaryString(num);
	    String binaryRepresentation = convertToBinary.apply(nb);
	    System.out.println("Binary representation: " + binaryRepresentation);
	    nb = 747;
	    System.out.println("\nNumber: " + nb);
	    convertToBinary = num -> Integer.toBinaryString(num);
	    binaryRepresentation = convertToBinary.apply(nb);
	    System.out.println("Binary representation: " + binaryRepresentation);
	}
	  
	 
}
