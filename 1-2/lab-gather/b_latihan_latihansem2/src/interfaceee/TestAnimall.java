package interfaceee;

interface Animal{
	public void bark();
}

class Dog implements Animal{

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Dog is barking");
		
	}
	
}

public class TestAnimall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d= new Dog();
		
		d.bark();

	}

}
