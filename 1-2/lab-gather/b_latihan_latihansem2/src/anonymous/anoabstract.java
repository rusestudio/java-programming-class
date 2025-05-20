package anonymous;

//Abstract class Animal with an abstract method makeSound
abstract class Animal3 {
 // Abstract method makeSound
 abstract void makeSound();
}

public class anoabstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // Creating an anonymous class that extends Animal and overrides makeSound method
        Animal3 cat = new Animal3() {
            // Overriding the makeSound method
            @Override
            void makeSound() {
                System.out.println("Meow");
            }
        };

        // Calling the makeSound method
        cat.makeSound();

	}

}
