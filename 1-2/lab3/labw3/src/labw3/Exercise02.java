package labw3;
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		Account acc = new Account();

		acc.printinfo("202411965", "다야나", 10000); //print info
		acc.balance =10000;
		System.out.println();


		int fx;
		int amount;

		System.out.println("0: 입급	1: 출금");
		System.out.print("업무를 선택하세요:");
		fx=input.nextInt();

		//print here if true print
		//if false print false

		switch(fx) {

		case 0:
			System.out.print("금액을 입력해주세요:");
			amount=input.nextInt(); //5000
			if (acc.deposit(amount)==true) {
				System.out.print(amount+ "원 입금되었습니다. 잔액: "+ acc.balance);
			}else {
				System.out.print("잘못된 금액을 입력하였습니다.");
			}
			break;
			
		case 1:
			System.out.print("금액을 입력해주세요:");
			amount=input.nextInt();
			if (acc.withdraw(amount)==true) {
				System.out.print(amount+ "원 출금되었습니다. 잔액: "+ acc.balance);//acc.balance call field balance not method
			}else {
				System.out.print("잔액이 부족하거나 잘못된 금액을 입력하였습니다.");
			}
			break;

		default:
			System.out.print("1 아니면 0만 입력");
			break;
		}


	}

}
