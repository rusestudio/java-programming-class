package hello2chp5;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum; //declare variable for result
		int sub;
		int multi;
		int div;
		
		Math obj = new Math(); // must decalre first
		//int sub = new Math(); // must decalre first
		//int multi = new Math(); // must decalre first
		//Math div = new Math(); // must decalre first
		
		
		
		
		sum = obj.add(2, 3); // argument
		System.out.println("2 and 3 sum is: " + sum);
		
		sum = obj.add(7, 8);
		System.out.println("7 and 8 sum is: " + sum);
		
		sub = obj.sub(10, 9);
		System.out.println("10 and 9 subtract is: " + sub);
		
		multi = obj.multi(7, 7);
		System.out.println("7 and 7 times is: " + multi);

		div = obj.div(20, 5);
		System.out.println("20 and 5 divide is: " + div);
		
		
		
		
		
		
		
		
	}

}
