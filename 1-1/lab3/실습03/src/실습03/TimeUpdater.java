package 실습03;
import java.util.Scanner;


public class TimeUpdater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int hour;
		int minute=0;

		System.out.print("시간 입력(시간은 1~23):");
		hour = input.nextInt();

		System.out.print("분 입력(분은 0~59):");
		minute = input.nextInt();

		if (hour+(minute+30)/60 >= 24){
			hour= hour + (minute + 30)/60 - 24;
			minute=(minute+30)%60;
		} else  {
			hour = hour + (minute + 30)/60; //
			minute=(minute+30)%60;
		}
		System.out.print( hour +"시간 " + minute +"분");	
	}
// minute=(minute+30)%60
}

