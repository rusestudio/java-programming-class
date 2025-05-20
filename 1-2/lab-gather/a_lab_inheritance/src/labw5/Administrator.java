package labw5;

public class Administrator extends User {
	
	public Administrator(String name, String id, String password) {
		super(name, id, password);
		
		
	}
	
	public void printRole() {
		System.out.println(name + "님은 관리자입니다.");
		
	}
	
	public void manage() {
		System.out.println(name + "님은 시스템을 관리자입니다.");
	}

}
