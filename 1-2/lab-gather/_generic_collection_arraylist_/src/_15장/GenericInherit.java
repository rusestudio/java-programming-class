package _15장;

public class GenericInherit {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box<Number> box = new Box<Number>();
		box.add(new Integer(10));
		box.add(new Double(10.1)); 
		//cannot use int n double type coz not class of number.
		
		box.add((10));

	}

}
