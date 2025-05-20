package chp62;

public class BoxSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxSame2 obj1 = new BoxSame2(10,20,50); 
		BoxSame2 obj2 = new BoxSame2(10,20,50); 
		
		System.out.println("obj1 == obj2 : " + obj1.isSameBox(obj2));
	

	}

}
