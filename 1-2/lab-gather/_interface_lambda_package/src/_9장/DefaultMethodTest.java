package _9장;

interface MyInterface{
	
	public void myMethod1();
	default void myMethod2() {
		System.out.println("myMethod2()");
	}
}

public class DefaultMethodTest implements MyInterface {
	
	public void myMethod1() {
		System.out.println("myMethod1()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodTest obj = new DefaultMethodTest();
		
		obj.myMethod1();
		obj.myMethod2(); 

	}

}
