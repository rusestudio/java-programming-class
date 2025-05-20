package _7장;

public class Animal2 {
	void sound() {
		System.out.println("animal sound");
	}

}

class Dog extends Animal2{
	void sound() {
		System.out.println("dog sound");
	}
}

class Cat extends Animal2{
	void sound() {
		System.out.println("cat sound");
	}
}
