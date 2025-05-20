package _6장;
import java.util.Scanner;

public class ArrayProc {
	
	public void getValues(int[]array) {
		Scanner input = new Scanner(System.in);
		for(int i=0; i< array.length; i++) {
			System.out.print("성적을 입력하시오:");
			array[i]= input.nextInt();
		}	
	}
	
	
    public double getAverage(int[]array) {
    	double total=0;
    	for(int i=0; i< array.length; i++)
    		total = total + array[i];
    	return total/array.length;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final  int STUDENTS = 5;
		int[] scores = new int[STUDENTS];
		ArrayProc obj= new ArrayProc();
		
		obj.getValues(scores);
		System.out.println("평균은 =" + obj.getAverage(scores));

	}

}
