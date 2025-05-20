package latihan.inherit;

public class testperson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Employee employee1 = new Employee("Kortney", "Rosalee", 4451, "HR Manager");
	      System.out.println(employee1.getFirstName() + " " 
		 + employee1.getLastName() 
		 + " (" + employee1.getEmployeeId() + ")");
	      
		  Employee employee2 = new Employee("Junior", "Philipa", 4452, "Software Manager");
	      System.out.println(employee2.getFirstName() + " " 
		  + employee2.getLastName() 
		  + " (" + employee2.getEmployeeId() + ")");
	}

}
