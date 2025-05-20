package _7장;

public class DynamicCallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal2 animal = new Animal2();
		Dog dog = new Dog();
		Cat cat = new Cat();
		Animal2 obj;
		
		obj = animal;
		obj.sound();
		
		obj = dog;
		obj.sound();
		
		obj = cat;
		obj.sound();

	}

}
