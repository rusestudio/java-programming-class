package hello;
import java.util.Scanner; //scanner class 포함

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		double w;
		double h;
		double area;
		double perimeter;
		
		Scanner input = new Scanner(System.in); //input scanner
		
		System.out.print("사각형의 가로를 입력하시오: ");
		w = input.nextInt(); //input
		
		System.out.print("시각형의 세로를 입력하시오: ");
		h = input.nextInt(); //input
		
		area = w * h; //area formula
		perimeter = 2.0 * (w + h); //perimeter formula
		
		System.out.println("사각형의 넓이는= " + area);
		System.out.println("사각형의 둘레는= " + perimeter);
		}

}
