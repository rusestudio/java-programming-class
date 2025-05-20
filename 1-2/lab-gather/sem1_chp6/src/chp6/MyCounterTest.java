package chp6;

public class MyCounterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCounter obj1 = new MyCounter();
		MyCounter obj2 = new MyCounter();
		
		System.out.println("object counter 1= " + obj1.counter);
		System.out.println("object counter 2= " + obj2.counter);
		
		
		MyCounter obj3 = new MyCounter(100);
		MyCounter obj4 = new MyCounter(200);
		
		System.out.println("object counter 1= " + obj3.counter);
		System.out.println("object counter 2= " + obj4.counter);

	}

}
