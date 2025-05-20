package 실습02;
import java.util.Scanner; //scanner class 포함

public class StudentID2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String major, name; 
		int id;
		
		System.out.print("학과: ");
		major = input.next();
		
		System.out.print("학번: ");
		id = input.nextInt();
		
		System.out.print("이름: ");
		name = input.next();
		
		System.out.println("학과:\t" + major );
		System.out.println("학번:\t" + id);
		System.out.println("이름:\t" + name);

	}

}
