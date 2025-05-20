package latihan.examonline;

public class testaddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		// Create an Employee object
        Employee emp = new Employee("John Doe", 123, 50000.00);
        //Address add = new Address("Main Street", 101, "Springfield");

        // Set the address for the employee
        emp.setAddress("Main Street", 101, "Springfield");

        // Print the details of the employee
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getid());
        System.out.println("Employee Salary: " + emp.getSalary());
        System.out.println("Employee Address: " + emp.getAddress());

        // Tokenize and print the employee's name
        emp.nameTokenizer();
	}

}
