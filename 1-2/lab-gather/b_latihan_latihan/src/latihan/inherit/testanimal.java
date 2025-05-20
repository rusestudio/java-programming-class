package latihan.inherit;

public class testanimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1,a2,a3;
		
		a1=new Animal();
		a2= new Dog();
		a3= new BabyDog();
		
		a1.eat();
		a2.eat(); //print obj in dog
		a3.eat(); //print obj in baby dog

	}

}
