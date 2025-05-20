package 실습02;
import java.util.Scanner; //scanner class 포함

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int age = 0;
		String name = "";
		
		System.out.print("나이를 입력하세요:"); //입력 안내 출력
	    age = input.nextInt(); //input
	    
	    System.out.print("이름을 입력하세요:"); //입력 안내 출력
	    name = input.next(); //input
		
	    
	    System.out.println(" 제 나이는 " + age + "이고 이름은 " + name + "입니다.");
		
	}

}
