import java.util.Scanner;
public class ForSum {

	public static void main(String[] args) {

 int number = 0;
int sum = 0;

Scanner input = new Scanner(System.in);

System.out.print("숫자 입력:");
number = input.nextInt();


		for (int i=1; i <=number; i++){
                sum = sum + i;

}

 System.out.print(sum);

		
	}

}
