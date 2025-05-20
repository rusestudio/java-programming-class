package 실습07;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] array = new double[12];
		
		Scanner input = new Scanner(System.in);
		
		double temp = 0;
		for(int i = 0; i < 12; i++ ) {
			while(true) {
				System.out.print(i+1+"월달의 지출비용을 입력(단위: 만원):");
				temp = input.nextDouble();
				
				if (temp >= 0) { //to check number
					array[i] = temp;
					break;
				}
				else {
					System.out.println("음수가 입력. 다시 입력하세요");
				}
			}
		}
		//sum
		double sum = 0;
		for(int i=0; i < 12; i++) {
			sum = sum +array[i];
			} 
	      System.out.println("연간 사용 금액: " + sum);
		
		//average
	      double average = 0;
			for(int i=0; i < 12; i++) {
				average = sum / 12;
				} 
		      System.out.println("월 평균 사용금액: " + average);
		
		double min = 0;
		min = array[0];
		double month = array[0];
		//get min
		for(int i=0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
				month = i+1;
			} 
		}
		System.out.println("지출이 가장 적었던 월과 지출액:" + month + "월, " + min);
		
		//get max	
		double max = 0;
		max = array[0];
		for(int i=0; i < array.length; i++) {
				if(array[i] > max) {
					max = array[i];
					month = i+1;
				} 
			}
		System.out.println("지출이 가장 많았던 월과 지출액:" + month +"월, " + max);
		
	}

}
