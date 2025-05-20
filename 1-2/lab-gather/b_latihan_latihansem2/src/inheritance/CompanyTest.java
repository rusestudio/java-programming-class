package inheritance;

class Employee {
	
	int salary= 100;
	
	
	public int calculateSalary() {
		return salary;
	}
	
}

class Manager extends Employee {
    
	public int calculateSalary() {
		return salary + 100;
	}
    
}

class Developer extends Employee {
	
	public int calculateSalary() {
        return salary + 200;
    }
    
}

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		System.out.println("employee salary:" + e1.calculateSalary());
		
		Employee e2 = new Manager();
		System.out.println("manager salary:" + e2.calculateSalary());
		
		Employee e3 = new Developer();
		System.out.println("developer salary:" + e3.calculateSalary());

	}

}
