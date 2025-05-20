package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;


interface WordCounter {
	  int countWords(String text);
	}

public class lamb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. sum n multiply
		 // Create a list of integers
        List<Integer> nums = Arrays.asList(4, 2, 3, 6, 5, 1);
        System.out.println("Original array elements: " + nums);
        // Define the multiply and sum lambda expression
        int result = nums.stream()
                .reduce(1, (x, y) -> x * y)
                .intValue();

        // Print the result
        System.out.println("\nProduct of the list elements: " + result);

        // Calculate the sum of the list elements using lambda expression
        int sum = nums.stream()
                .reduce(0, (x, y) -> x + y)
                .intValue();

        // Print the sum
        System.out.println("\nSum of the list elements: " + sum);
        
        //2. count word in sentence
        String text = "Java lambda expression.";
        System.out.println("Original string: " + text);
        WordCounter wordCounter = s -> s.split("\\s+").length;
        int ctr = wordCounter.countWords(text);
        System.out.println("Word count: " + ctr);
        text = "The quick brown fox jumps over the lazy dog.";
        System.out.println("\nOriginal string: " + text);
        wordCounter = s -> s.split("\\s+").length;
        ctr = wordCounter.countWords(text);
        System.out.println("Word count: " + ctr);
        
        //3.check palindrome
     // Define the palindrome check lambda expression
        Predicate < String > isPalindrome = str -> {
          String reversed = new StringBuilder(str).reverse().toString();
          return str.equals(reversed);
        };

        // Check if a string is a palindrome using the lambda expression
        String word1 = "Madam";
        boolean isPalindromeResult1 = isPalindrome.test(word1);
        System.out.println(word1 + " is a palindrome? " + isPalindromeResult1);

        String word2 = "radar";
        isPalindromeResult1 = isPalindrome.test(word2);
        System.out.println(word2 + " is a palindrome? " + isPalindromeResult1);

        String word3 = "defied";
        isPalindromeResult1 = isPalindrome.test(word3);
        System.out.println(word3 + " is a palindrome? " + isPalindromeResult1);
        
       //4.sum of squares
        // Create a list of integers
        List < Integer > numss = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Original list elements: " + numss);
        // Calculate the sum of squares of odd numbers using lambda expression
        int sum_squares_odd = numss.stream()
          .filter(n -> n % 2 != 0)
          .mapToInt(n -> n * n)
          .sum();

        // Calculate the sum of squares of even numbers using lambda expression
        int sum_squares_even = numss.stream()
          .filter(n -> n % 2 == 0)
          .mapToInt(n -> n * n)
          .sum();

        // Print the results
        System.out.println("\nSum of squares of odd numbers: " + sum_squares_odd);
        System.out.println("\nSum of squares of even numbers: " + sum_squares_even);
      
        //5. check list contain string
        // Create a list of strings
        List < String > colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");
        // Specify the word to search for
        String searchColor = "Orange";
        // Check if the list contains the specified color using a lambda expression
        Predicate < String > containsWord = word -> word.equals(searchColor);
        boolean flag = colors.stream().anyMatch(containsWord);
        // Print the result
        System.out.println("Is the word " + searchColor + " present in the list? " + flag);
        // Specify the word to search for   
        String searchColor1 = "White";
        // Check if the list contains the specified color using a lambda expression
        Predicate < String > containsWord1 = word -> word.equals(searchColor1);
        flag = colors.stream().anyMatch(containsWord1);
        // Print the result
        System.out.println("\nIs the word " + searchColor1 + " present in the list? " + flag);
      
        //6. find longest n smallest string
     // Create a list of colors
        List < String > colorss = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");

        // Print the elements of the list
        System.out.println("Elements of the list: " + colorss);

        // Find the length of the longest string using lambda expression
        int max_length = colorss.stream()
          .mapToInt(String::length)
          .max()
          .orElse(0);
        // Print the length of the longest string
        System.out.println("Length of the longest string: " + max_length);

        // Find the length of the smallest string using lambda expression
        int min_length = colorss.stream()
          .mapToInt(String::length)
          .min()
          .orElse(0);
        // Print the length of the smallest string
        System.out.println("Length of the smallest string: " + min_length);
      
        //7.check perfect square
        // Define the perfect square check lambda expression
        Predicate < Integer > isPerfectSquare = n -> {
          int sqrt = (int) Math.sqrt(n);
          return sqrt * sqrt == n;
        };

        // Test the lambda expression with some numbers
        int N = 36;
        boolean result1 = isPerfectSquare.test(N);
        System.out.println(N + " is a perfect square? " + result1);

        N = 26;
        boolean result2 = isPerfectSquare.test(N);
        System.out.println(N + " is a perfect square? " + result2);

        N = 10000;
        boolean result3 = isPerfectSquare.test(N);
        System.out.println(N + " is a perfect square? " + result3);
      
        //8.find second largest n smallest
        // Create an array of integers
        Integer[] numsc = {
          1,
          7,
          18,
          25,
          77,
          300,
          101
        };
        System.out.println("Array elements: " + Arrays.toString(numsc));
        // Find the second largest element using lambda expression
        Integer secondLargest = Arrays.stream(numsc)
          .distinct()
          .sorted(Comparator.reverseOrder())
          .skip(1)
          .findFirst()
          .orElse(null);

        // Find the second smallest element using lambda expression
        Integer secondSmallest = Arrays.stream(numsc)
          .distinct()
          .sorted()
          .skip(1)
          .findFirst()
          .orElse(null);

        // Print the results
        System.out.println("Second largest element: " + secondLargest);
        System.out.println("Second smallest element: " + secondSmallest);
      
        
        
        
        
        
        
	}

}
