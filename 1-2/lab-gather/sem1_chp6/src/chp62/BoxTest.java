package chp62;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box obj1 = new Box(10,20,50); //pass value of box1 to obj1
		Box obj2 = new Box(10,30,30); //pass value of box2 to obj2
		
		Box largest = obj1.whosLargest(obj1, obj2); //use largest obj to print below
		System.out.println("(" +largest.width+ ","+ largest.length+ "," + largest.height+")");

	
		//example2
		Box obj3 = new Box(10,20,50); 
		Box obj4 = new Box(10,30,30); 
		
		Box largest2 = obj3.whosLargest(obj4); //use largest obj to print object
		System.out.println("(" +largest2.width+ ","+ largest2.length+ "," + largest2.height+")");
	

	}

}
