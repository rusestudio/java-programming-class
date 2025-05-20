package labansw;
import java.util.Scanner;

public class midtermx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] array = new double[12];
		
		Scanner input = new Scanner(System.in);
		
		double temp =0;
		
		for(int i=0; i<12; i++) {
			while(true) {
				System.out.print(i+1 + "월 사용 금액 입력(단위 만원):");
				temp = input.nextDouble();
				if(temp>=0) {
					array[i] = temp;
					break;
				}
				else {
					System.out.println("음수 금액 입력했으니 다시 입력.");
				}
			}
		}
		
		double sum =0;
		
		for(int i =0; i<12; i++) {
			sum += array[i];
		}
		
		double max = array[0];
		double min = array[0];
		int max_month=1;
		int min_month=1;
				
		for(int i=0; i<12; i++) {
			if(max < array[i]) {
				max = array[i];
				max_month=i+1;
			}
		}
		for(int i=0; i<12; i++) {
			if(min > array[i]) {
				min = array[i];
				min_month=i+1;
			}
		}
        
		System.out.println("연간 사용 금액:" + sum);
		System.out.println("월 평균 사용 금액:" + sum/12);
		System.out.println("가장 많이 사용 금액:" + max_month+ "월" + max );
		System.out.println("가장 적은 사용 금액:" + min_month + "월 "+ min);
		

	}

}
