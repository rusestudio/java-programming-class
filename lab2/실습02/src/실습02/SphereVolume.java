package 실습02;
import java.util.Scanner; //scanner class 포함

public class SphereVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int radius;
	    double volume;
		
		System.out.print("반지름을 입력하세요:");
		radius = input.nextInt();
		
		volume = 4.0/3.0 * 3.14 * radius * radius * radius;
		
		System.out.println("반지름이 " + radius + "인 구의 부피는" + volume + "이다." );
		
		
	}

}
