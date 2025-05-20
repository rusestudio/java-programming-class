package chp62;

public class Employee {
	
	private String name;
	private double salary;
	private static int count =0;//static var
	
	public Employee(String n, double s) {
		name = n;
		salary = s;
		count++; //increase static var count++
	}
	
	protected void finalize() { //call when object destroy
		count--; //when employee decreace count--
	}
	
	public static int getCount() { //static method
		return count; //only access static var
	}

}
