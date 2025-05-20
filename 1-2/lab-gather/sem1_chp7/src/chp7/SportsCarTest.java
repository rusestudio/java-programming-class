package chp7;

public class SportsCarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SportsCar obj = new SportsCar(); //call child class create obj
		obj.speed = 10; //use parent class field and method
		obj.setSpeed(60);
		obj.setTurbo(true); //just use child class alone
		
		System.out.println("speed:" + obj.speed); // to print cannnot use set
		System.out.println("speed:" + obj.turbo);// must print obj.variable
	}

}
