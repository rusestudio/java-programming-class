package hello;
import java.util.Scanner; //scanner class 포함

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		double radius;
		double area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("반지름을 입력하시오:");
		radius = input.nextDouble();
		
		area = 3.14 * radius * radius;
		
		System.out.println(area);
		
	}

}
