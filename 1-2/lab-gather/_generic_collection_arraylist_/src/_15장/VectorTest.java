package _15장;

import java.util.Vector; 

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector vc = new Vector(); 
		//클래스는java.util 패키지에 있는 컬렉션의일종으로가변크기의배열(dynamic array)을 구현하고 있다. 

		
		vc.add("Hello World!"); //index 0
		vc.add(new Integer(10)); //i 1
		vc.add(20); //i 2
		
		System.out.println("vector size: " + vc.size());
		
		for(int i=0; i<vc.size(); i++) {
			System.out.println("vector element"+ i + ":" + vc.get(i));
		}
		
		String s = (String)vc.get(0);
		

	}

}
