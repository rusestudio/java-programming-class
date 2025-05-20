package labw5;

public class Student extends User {
	
	public Student(String name, String id, String password) {
		super(name, id, password);
		
	}
	
	public void printRole() {
		System.out.println(name + "님은 학생입니다.");
		
	}
	
	public void submit() {
		System.out.println(name + "과제를 제출합니다.");
		
	}

}
