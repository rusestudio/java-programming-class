package latihan.inherit;
//multi level inherit

class Animal {
	void eat() {
		System.out.println("eating");
	}

}

class Dog extends Animal {
	void eat() {
		System.out.println("eat fruit");
	}

}

class BabyDog extends Dog {
	void eat() {
		System.out.println("drink milk");
	}

}

