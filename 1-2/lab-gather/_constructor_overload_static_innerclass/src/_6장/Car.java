package _6장;

public class Car {
	
	int speed;
	
	Car(){
		System.out.println("속도는"+speed); //instance initializer block
	}
	
	{ speed = 100;} //instance initializer block

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		Car c2 = new Car();
		

	}

}
