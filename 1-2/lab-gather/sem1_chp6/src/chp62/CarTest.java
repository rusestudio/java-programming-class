package chp62;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car("s600","white",80); //first contructor call
		Car c2 = new Car("e500","blue",20);// sec cons call
		
		int n = Car.numbers; //classname.staticvariablename
		
		System.out.println("the number of contructed car: " + n);

	}

}
