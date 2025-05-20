package Lambda;

import java.util.function.LongUnaryOperator;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//define factorial lamba expression
		LongUnaryOperator factorial = n ->{
			long result =1;
			for(long i = 1; i <=n; i++) {
				result = result*i;
			}
			return result;
		};
		
		//calculate factorial use lambda
		long n =7;
		long factorial_result = factorial.applyAsLong(n);
		
		//print result
		System.out.println("factorial of: " + n+ " is:" + factorial_result);

	}

}
