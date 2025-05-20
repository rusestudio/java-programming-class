package inheritance;

class v1 {
	
	public void startengine() {
		System.out.println("start engine");
	}
	
}

class c1 extends v1{
	
	public void startengine() {
		System.out.println("start engine car");
	}
	
}

class m1 extends v1{
	
	public void startengine() {
		System.out.println("start engine motor");
	}
	
}

public class Vtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		v1 obj1 = new c1();
		m1 obj2 = new m1();
		
		obj1.startengine(); // start engine car
		obj2.startengine(); // start engine motor

	}

}
