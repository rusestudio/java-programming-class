package _9장;

interface Drivable{
	void drive();
}

interface Flyable{
	void fly();
}

public class FlyingCar1 {
	
	public void drive() {
		System.out.println("Im driving");
	}
	
	public void fly() {
		System.out.println("I'm flying");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyingCar1 obj = new FlyingCar1();
		
		obj.drive();
		obj.fly();

	}

}
