package hjyjavaw4;
import java.util.Scanner;

public class ATMMachine2 { //Q11

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
	        double balance = 5000.0; // 초기 잔액
	        boolean done = false; // 완료?

	        while (!done) { // 완료가 아닌 동안 반복

	            System.out.println("잔액 확인: \t1");
	            System.out.println("현금 인출: \t2");
	            System.out.println("입금: \t\t3");
	            System.out.println("종료: \t\t4");
	            System.out.print("번호 선택: ");
	            int i = input.nextInt();
	            double amount; // 금액

	            switch (i) {
	                case 1:
	                    System.out.println("잔액은 " + balance + "원입니다.");
	                    break;
	                case 2:
	                    System.out.print("얼마를 인출하시겠습니까? ");
	                    double withdrawAmount = input.nextDouble();
	                    // 인출할 금액이 잔액보다 클 경우 처리
	                    if (withdrawAmount > balance) {
	                        System.out.println("돈이 모자랍니다.");
	                        System.out.println("잔액은 " + balance + "원입니다.");
	                        break;
	                    }
	                    balance -= withdrawAmount;
	                    System.out.println("돈을 받으세요.");
	                    System.out.println("잔액은 " + balance + "원입니다.");
	                    break;
	                case 3:
	                    System.out.print("금액은? ");
	                    double depositAmount = input.nextDouble();
	                    balance += depositAmount;
	                    System.out.println("잔액은 " + balance + "원입니다.");
	                    break;
	                case 4:
	                    // 감사하다는 인삿말을 출력함.
	                    // done을 true로 만듬(작업이 완료되었다는 의미)
	                    // 이렇게 하면 while loop가 끝나게 됨.
	                    System.out.println("감사합니다.");
	                    done = true;
	                    break;
	                default:
	                    System.out.println("올바르지 않은 번호입니다.");
	            }
	        }
	        input.close();

	}

}
