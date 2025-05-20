package chp7two;

public class animaltest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat2 myCat = new Cat2();
		animal2 myAnimal = myCat;
		myAnimal.eat(); // myCat.eat()?
		myAnimal.sound(); // myCat.sound()?
	}

}
