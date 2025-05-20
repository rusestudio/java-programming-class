package labw3;

public class Pizza { 
	
	char size;
	String name;
	
	void order() {
		System.out.println("기본 사이즈의 기본 피자를 주문하였습니다.");
	}
	
	void order(char size) {
		System.out.println(size + " 사이즈의 기본 피자를 주문하였습니다.");
	}
	
	void order(String name) {
		System.out.println("기본 사이즈의 " + name+ " 피자를 주문하였습니다.");
	}
	
	void order(char size, String name) {
		System.out.println( size +" 사이즈의 " + name+ " 피자를 주문하였습니다.");
	}
	

}
