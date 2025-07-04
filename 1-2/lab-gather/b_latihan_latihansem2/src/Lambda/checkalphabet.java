package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class checkalphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

	  }
	  public static boolean checkCase(List < String > strings, Predicate < String > checkFunction, Function < String, String > convertFunction) {
	    String firstString = strings.get(0);
	    String convertedString = convertFunction.apply(firstString);

	    return strings.stream()
	      .allMatch(s -> checkFunction.test(s));

	}

}
