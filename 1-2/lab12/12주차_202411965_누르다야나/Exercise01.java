
package labw12;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner input = new Scanner(System.in);
	        int[] result = new int[5];
	        int idx = 0;

	        while (true) {
	            try {
	                System.out.print("첫 번째 숫자를 입력하세요: ");
	                int n1 = Integer.parseInt(input.nextLine());

	                System.out.print("두 번째 숫자를 입력하세요: ");
	                int n2 = Integer.parseInt(input.nextLine());

	                result[idx] = n1 % n2;
	                System.out.println("나머지 연산 결과: " + result[idx]);
	                idx++;

	                System.out.print("\n계속하려면 y를 입력하세요: ");
	                if (!input.nextLine().toLowerCase().equals("y")) break;
	                System.out.println();

	            } catch (NumberFormatException e) {
	                System.err.println("\n예외 발생:숫자 형식이 잘못되었습니다. 올바른 정수를 입력해주세요.");
	                System.out.println("\n다시 입력해주세요.");
	            } catch (ArithmeticException e) {
	                System.err.println("\n예외 발생:0으로 나눌 수 없습니다. 두 번째 숫자는 0이 아닌 값을 입력해주세요.");
	                System.out.println("\n다시 입력해주세요.");
	            } catch (ArrayIndexOutOfBoundsException e) {
	                System.err.println("\n예외 발생:최대 5개 결과만 저장할 수 있습니다. 프로그램을 종료.");
	                break;
	            }
	        }

	        input.close();
	        System.out.println("프로그램 종료");

	}

}



