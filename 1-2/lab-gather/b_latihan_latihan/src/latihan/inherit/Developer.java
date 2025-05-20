package latihan.inherit;

public class Developer extends Employees{
	
	private String programminglanguage;
	
	public Developer( String name, String address, int salary, String jobtitle,  String programminglanguage) {
		super( name,  address,  salary,  jobtitle);
		this.programminglanguage= programminglanguage;
	
	}
	
	public String getProgramminglanguage() {
		return programminglanguage;
	}
	
	@Override
	public double calculationBonus() {
		return getSalary()*0.10;
	}
	
	@Override
	public String generatePerformanceReport() {
		return "Performance report for developer" + getName()+ "good";
	}
	
	public void writeCode() {
		System.out.println("developer"+ getName()+ "is writing code in"+ programminglanguage);
	
	}

}
