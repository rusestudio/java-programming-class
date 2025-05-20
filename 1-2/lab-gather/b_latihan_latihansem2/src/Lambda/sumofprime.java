package Lambda;

import java.util.stream.IntStream;

public class sumofprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int start_prime = 100;
	     int end_prime = 200;

	     // Calculate the sum of prime numbers using lambda expression
	     int sumOfPrimes = IntStream.rangeClosed(start_prime, end_prime)
	    		 .filter(n -> sumofprime.isPrime(n))
	       .sum();
	     System.out.println("Sum of prime numbers between " + start_prime + " and " + end_prime + ": " + sumOfPrimes);
	   }
	
	   // Lambda expression to check if a number is prime
	   public static boolean isPrime(int number) {
	     if (number <= 1) {
	       return false;
	     }
	     for (int i = 2; i <= Math.sqrt(number); i++) {
	       if (number % i == 0) {
	         return false;
	       }
	     }
	     return true;

	}

}
