package chp62;

public class Mycountertest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mycounter obj = new Mycounter();
		
		System.out.println("obj.value= " + obj.value); //value=0
		
		obj.inc(obj); //pass by reference from ctr method
		System.out.println("obj.value= " + obj.value); //value 0+1=1

	}

}
