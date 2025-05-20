package week13;

public class Child extends Parent {
	private int studentNumeber;
	
	// 코드를 수정하고 이유를 적어주세요!
	public Child(String name, int studentN) {
		super(name);           // super 사용해서 부모의 생성자를 부른다.   
		this.studentNumeber = studentN;
	}
}
