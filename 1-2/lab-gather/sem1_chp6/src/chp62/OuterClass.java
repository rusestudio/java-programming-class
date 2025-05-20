package chp62;

public class OuterClass {
	private int value =10;
	
	class InnerClass{
		public void myMethod() {
			System.out.println("outer class의 private variable value: "+ value);
		}
	}
	
	OuterClass(){  //basic contructor
		InnerClass obj = new InnerClass();
		obj.myMethod();
	}

}
