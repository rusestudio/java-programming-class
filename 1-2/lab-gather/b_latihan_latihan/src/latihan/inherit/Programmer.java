package latihan.inherit;

public class Programmer extends Developer {
	
	public Programmer( String name, String address, int salary,  String programminglanguage) {
		super( name,  address,  salary,  "Programmer", programminglanguage);
	
	}
	
	public double calculationBonus() {
		return getSalary()*0.12;
	}
	
	public String generatePerformanceReport() {
		return "Performance report for Programmer" + getName()+ "excellent";
	}
	
	public void debugCode() {
		System.out.println("programmer"+ getName()+ "is debugging code in"+ getProgramminglanguage());
	}
	

}
