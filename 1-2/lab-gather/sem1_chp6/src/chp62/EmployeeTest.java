package chp62;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1,e2,e3;
		
		e1 = new Employee("cholsu", 35000);
		e2 = new Employee("suchol", 50000);
		e3 = new Employee("cholho", 20000);

		int n = Employee.getCount(); // call static method
		
		System.out.println("current employee number: " + n);
		
	}

}
