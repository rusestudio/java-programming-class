package labansw;
import java.util.Scanner;

public class TimeUpdater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int hour = 0;
		int  min = 0;
		
		System.out.print("enter hour:");
		hour = input.nextInt();
		
		System.out.print("enter minutes:");
		min =  input.nextInt();
		
		if (hour + (min+ 30) / 60>=24) {
			System.out.print(hour + (min+30)/60-24 +" 시간 "
					+(min + 30)% 60 + " 분");
		}else {
			System.out.print(hour + (min+30)/60+" 시간 "
					+(min + 30)% 60 +  " 분");
		}
		
	}

}
