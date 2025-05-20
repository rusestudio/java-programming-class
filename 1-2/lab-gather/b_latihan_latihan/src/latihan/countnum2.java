package latihan;
import java.util.Scanner;

public class countnum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner input= new Scanner(System.in);
		 
			
			System.out.print("input a number:");
			int num = input.nextInt();
			
			System.out.print(value2(num));
	}
	
public static int value2(int num) {
		
	int ctr = 0;
    int n = num;
    do{
      if (n % 10 == 2){
          ctr ++;
      }
      n /= 10;
      
     }
    while(n > 0);
      return ctr;
		
	}
}
