package inheritance;

class Animal{
	
	public void makeSound() {
		System.out.println("sound");
	}
}

class Mammal extends Animal{
	
	public void giveBirth() {
		System.out.println("Giving birth");
	}
}

class Dog extends Mammal{
	
	public void makeSound() {
		System.out.println("Woof!");
	}
}

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
		
		a.makeSound();
		
		Mammal m = new Mammal();
		
		m.giveBirth();
		
		Dog d = new Dog();
		
		d.makeSound();
		d.giveBirth();

	}

}
