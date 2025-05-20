package loop;
import java.util.ArrayList;
import java.util.List;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int odd = 0, even = 0;

		        List<Integer> oddNumbers = new ArrayList<>();
		        List<Integer> evenNumbers = new ArrayList<>();

		        for (int i = 0; i < 20; i++) {
		            if (i % 2 == 0) {
		                even += i;
		                evenNumbers.add(i);
		            } else {
		                odd += i;
		                oddNumbers.add(i);
		            }
		        }

		        System.out.println("Even Numbers: " + evenNumbers.toString());
		        System.out.println("Sum of even numbers: " + even);
		        System.out.println("Odd Numbers: " + oddNumbers.toString());
		        System.out.println("Sum of odd numbers: " + odd);
		    }
		

}
