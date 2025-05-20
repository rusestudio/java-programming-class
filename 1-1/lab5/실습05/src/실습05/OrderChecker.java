package 실습05;
import java.util.Scanner;


public class OrderChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String[] fruitname;
		
         int arraysize = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("배열 크기 입력:");
		arraysize = input.nextInt();    // get array size
		
       String[] fruitname = new String [arraysize]; // string
  		
		//System.out.print("과일을 입력:"); 
		
		for (int i = 0; i< arraysize; i++) {
			System.out.print("과일을 입력:");
			fruitname[i] = input.next();  // get fruit name array
		}
		
		//String[] checkfruit = new String [arraysize]; // same like check
		
		String checkfruit;
		//int count = 0;
		
		System.out.print("주문할 과일 입력:");
		checkfruit = input.next();    // get check fruit name
			

		boolean fruit = true;
		
		for (int i = 0; i < arraysize; i++) {
           if (checkfruit.equals(fruitname[i])) {
            	fruit =false;
               System.out.println(checkfruit + " 주문되었습니다");
                break; // exit the loop once the fruit is found
            }
       }

       if (fruit) {
           System.out.print(checkfruit + " 주문할 수 없다");
        }
		
	}

}
