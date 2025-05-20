package _7장;

public class Child  extends Parent{
	
	public void print() {
		System.out.println("print class in child class");// method override
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child obj = new Child();
		obj.print();

	}

}
