package latihan.abstractt;

abstract class Animal {
	
	abstract void sound();

}

class Lion extends Animal{
	
	void sound() {
		System.out.println("lion roar");
	}
	
}

class Tiger extends Animal{
	
	void sound() {
		System.out.println("Tiger roar");
	}
	
}
