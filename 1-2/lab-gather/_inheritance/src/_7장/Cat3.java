package _7장;

public class Cat3 extends Animal3 {
	
	public static void eat() {
		System.out.println("cat eat");
	}
	
	public void sound() {
		System.out.println("cat sound");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat3 mycat = new Cat3();
	    Animal3 myani =  mycat;
		
		Animal3.eat();
		Cat3.eat();
		
		myani.eat();
		mycat.eat();
		
		myani.sound();
		
		
		
		

	}

}
