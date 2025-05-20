package latihan.inherit;

public class Manager extends Employees{
	
	private int numOfSubcoor;
	
	public Manager( String name, String address, int salary, String jobtitle,  int numOfSubcoor) {
		super( name,  address,  salary,  jobtitle);
		this.numOfSubcoor= numOfSubcoor;
	
	}
	
	public int getNumOfSubCoor() {
		return numOfSubcoor;
	}
	
	@Override
	public double calculationBonus() {
		return getSalary()*0.15;
	}
	
	@Override
	public String generatePerformanceReport() {
		return "Performance report for Manager" + getName()+ "Excellent";
	}
	
	public void manageProject() {
		System.out.println("Manager"+ getName()+ "is managing a project");
	}
	

}
