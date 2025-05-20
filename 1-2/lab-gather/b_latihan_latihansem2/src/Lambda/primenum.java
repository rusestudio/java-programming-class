package Lambda;

import java.util.function.Predicate;

public class primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//define prime check lamba
		Predicate<Integer> is_Prime = n -> {
			if(n <= 1) {
				return false;
			}
			for(int i =2; i<= Math.sqrt(n); i++) {
				if(n %i==0) {
					return false;
				}
			}
			return true;
		};

		//check if number prime use lambda
		int n = 17;
		boolean isPrimeResult = is_Prime.test(n);

		//print result
		System.out.println(n + " is prime?"+ isPrimeResult);

		//check if number prime use lambda
		n = 15;
		isPrimeResult = is_Prime.test(n);

		//print result
		System.out.println(n + " is prime?"+ isPrimeResult);

	}

}
