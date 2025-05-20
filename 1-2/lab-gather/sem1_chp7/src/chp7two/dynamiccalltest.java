package chp7two;

public class dynamiccalltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal animal = new animal(); 
		Dog dog = new Dog(); 
		Cat cat = new Cat(); 
		animal obj;
		obj = animal;
		obj.sound(); // Animal의 sound()
		obj = dog; 
		obj.sound(); // Dog의 sound()
		obj = cat; 
		obj.sound(); // Cat의 sound()
		
	}

}
