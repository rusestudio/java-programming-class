package chp7;

public class Employee {

	public String name;
	String address;
	protected int salary;
	private int rrn;
	
	//constructor for parent class
	public Employee(String name,String address, int salary, int rrn) {
		this.name= name;
		this.address= address;
		this.salary= salary;
		this.rrn= rrn;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name+", address=" + address
				+ ", salary=" +salary+ ",rrn=" + rrn+ "]";
		}
	
	
	
	
	
	
	
	
}
