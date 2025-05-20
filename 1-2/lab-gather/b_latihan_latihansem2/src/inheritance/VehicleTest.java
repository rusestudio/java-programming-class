package inheritance;

class Vehicle {
	
	String model;
	int year;
	
	public Vehicle(String model, int year) {
		this.model=model;
		this.year=year;
	}
	
}

class Car extends Vehicle {
	
	public Car(String model, int year) {
		super(model, year); // Vehicle() 생성자 호출	
	}
	
}

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car("toyota", 2023);
		
		System.out.println("Car model: " + c1.model);
		System.out.println("Car year: " + c1.year);
	}

}
