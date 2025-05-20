package _7장;

public class Eagle extends Animal {
	
	private int wings=2;
	
	void fly() {
		System.out.println("fly() method out");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lion lion1 = new Lion();
		Eagle e1 = new Eagle();
		
		lion1.eat();
		lion1.sleep();
		lion1.roar();
		
		e1.eat();
		e1.sleep();
		e1.fly();

	}

}
