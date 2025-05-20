package _7장;

public class Manager extends Employee{
	
	private int bonus;
	
	public Manager(String name, String address, int salary, int rrn, int bonus) {
		super(name,address,salary, rrn);
	}
	
	void test() {
		System.out.println("name="+ name);
		System.out.println("address="+ address);
		System.out.println("salary="+ salary);
		//System.out.println("rrn="+ rrn);// cannot access private field from parent class
		
	}

}
