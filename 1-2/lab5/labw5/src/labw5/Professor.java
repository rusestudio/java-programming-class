package labw5;

public class Professor extends User{
	
	public Professor(String name, String id, String password) {
		super(name, id, password);
		
	}
	
	public void printRole() {
		System.out.println(name + "님은 교수입니다.");
		
	}
	
	public void grading() {
		System.out.println(name + "님의 채점을 시자합니다.");
	}

}
