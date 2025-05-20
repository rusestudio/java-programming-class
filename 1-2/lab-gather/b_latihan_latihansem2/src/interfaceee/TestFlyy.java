package interfaceee;

interface Flyable{
	void fly_obj();
}

class Spacecraft implements Flyable{

	@Override
	public void fly_obj() {
		// TODO Auto-generated method stub
		System.out.println("spaceship fly");
	}
	
}

class Airplane implements Flyable{

	@Override
	public void fly_obj() {
		// TODO Auto-generated method stub
		System.out.println("aeroplane fly");
		
	}
	
}

class Helicopter implements Flyable{

	@Override
	public void fly_obj() {
		// TODO Auto-generated method stub
		System.out.println("heli fly");
		
	}
	
}


public class TestFlyy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Spacecraft s = new Spacecraft();
		//Airplane a = new Airplane();
		//Helicopter h = new Helicopter();
		
		//s.fly_obj();
		//a.fly_obj();
		//h.fly_obj();
		
		 // Create an array of Flyable objects, including a Spacecraft, Airplane, and Helicopter
        Flyable[] flyingObjects = {new Spacecraft(), new Airplane(), new Helicopter()};

        // Iterate through the array and call the "fly_obj" method on each object
        for (Flyable obj : flyingObjects) {
            obj.fly_obj();
        }
	}

}
