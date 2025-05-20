package hjyjavaw4;
import java.util.Scanner;

public class ATMMachine { //Q10

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        double balance = 5000.0; // 초기 잔액
         
        System.out.println("잔액 확인: \t1");
        System.out.println("현금 인출: \t2");
        System.out.println("입금: \t\t3");
        System.out.println("종료: \t\t4");
        System.out.print("번호 선택: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("잔액은 " + balance + "원입니다.");
                break;
            case 2:
                System.out.print("얼마를 인출하시겠습니까? ");
                double withdrawAmount = input.nextDouble();
                if (withdrawAmount > balance) {
                    System.out.println("돈이 모자랍니다.");
                             System.out.println("잔액은 " + balance + "원입니다.");
                } else {
                     balance -= withdrawAmount;
                     System.out.println("돈을 받으세요.");
                     System.out.println("잔액은 " + balance + "원입니다.");
                }
                break;
            case 3:
                System.out.print("금액은? ");
                double depositAmount = input.nextDouble();
                balance += depositAmount;
                System.out.println("잔액은 " + balance + "원입니다.");
                break;
            case 4:
                System.out.println("감사합니다.");
                break; // case 4에 break 추가
            default:
                System.out.println("올바르지 않은 번호입니다.");
        }
        input.close(); // Scanner 닫기
   
	}

}
