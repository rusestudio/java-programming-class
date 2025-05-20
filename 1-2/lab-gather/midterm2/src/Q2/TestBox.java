package Q2;
import java.util.Scanner;

public class TestBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		//array store 5 data
		int BoxArea[] = new int[5];
		int BoxVolume[] = new int[5];

		//enter 3 numeric data for 5 box
		
		int l=0;
		int w=0;
		int d=0;
		
		//input 3 data for 5 box
			System.out.println("enter length: ");
			l = input.nextInt();

			System.out.println("enter width: ");
			w = input.nextInt();

			System.out.println("enter depth: ");
			d = input.nextInt();
		
		BoxArea b = new BoxArea(l, w, d);
		
		b.setLength(l);
		b.setWidth(w);
		b.setDepth(d);
		
		System.out.println(b.surfaceArea());
		
		BoxVolume b1 = new BoxVolume(l, w, d);
		
		b1.setLength(l);
		b1.setWidth(w);
		b1.setDepth(d);
		
		System.out.println(b1.volume());
		
		int result = b.compareTo(b1);

		if (result == 1)
			System.out.println(b + "가 더 큽니다.");
		else if (result == 0)
			System.out.println("같습니다");
		else
			System.out.println(b1 + "가 더 큽니다.");

				;

		
		
		
		
		
		
		
		
		

	}

}
