package latihan.examonline;
import java.util.StringTokenizer; 

public class Employee {
	
	public String name;
	public int id;
	public double salary;
	public Address address;
	
	
	public Employee(String name, int id, double salary) {
		this.name= name;
		this.id= id;
		this.salary= salary;
		address= new Address();
	}
	
	public String getName() {
		return name;
	}
	
	public int getid() {
		return id;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setAddress(String street, int house, String city)
	{ address.changeAddress(street, house, city);
	}
	public String getAddress()
	{ return address.getStreet()+ address.getHouse()+ address.getCity();
	} 

	public void nameTokenizer() {
		StringTokenizer st = new StringTokenizer(name);
		 while (st.hasMoreTokens())
		 { String token = st.nextToken ();
		 System.out.println ("Token is " + token); 
	}
}}
