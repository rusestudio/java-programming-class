package chp62;

public class Car2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car2StaticMethod c1 = new Car2StaticMethod("s600","white",80); //first contructor call
		Car2StaticMethod c2 = new Car2StaticMethod("e500","blue",20);// sec cons call
		
        int n = Car2StaticMethod.getNumberofCars(); //call static method.
		
		System.out.println("the number of contructed car: " + n);

	}

}
