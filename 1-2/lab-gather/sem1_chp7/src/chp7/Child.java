package chp7;

public class Child extends Parent {
	
	//method override in parent class
	public void print() {
		super.print(); //call parent class method
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child obj = new Child();
		obj.print();

	}

}
