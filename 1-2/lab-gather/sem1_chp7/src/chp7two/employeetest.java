package chp7two;

public class employeetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		date birth = new date(1990, 1, 1);
		Employee employee = new Employee("홍길동"
		, birth);
		System.out.println(employee); // employee.toString()
	}

}
