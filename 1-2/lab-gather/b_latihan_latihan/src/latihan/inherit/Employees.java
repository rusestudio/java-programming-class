package latihan.inherit;

public class Employees {
	
	private String name;
	private String address;
	private double salary;
	private String jobtitle;
	
	//contructor parent class
	public Employees(String name, String address, int salary, String jobtitles) {
		this.name= name;
		this.address= address;
		this.salary= salary;
		this.jobtitle= jobtitle;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getJobtitle() {
		return jobtitle;
	}
	
	public double calculationBonus() {
		return 0.0;
	}
	
	public String generatePerformanceReport() {
		return "no performance available";
	}

	public double calculateBonus() {
		// TODO Auto-generated method stub
		return 0;
	}

}
