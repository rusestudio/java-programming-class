package labw4;
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		BankSystem bank = new BankSystem(100);
		
		String number, name, pwd;
		int balance, idx;
		boolean flag = true;
		
		System.out.println("=======menu======");
		System.out.println("0. 계좌 개설");
		System.out.println("1. 계좌 로그인(재로그인)");
		System.out.println("2. 입출금/이체/조회");
		System.out.println("3. 중료");
		System.out.println("=================");
		
		while(flag) {
			
			System.out.print("메뉴를 선택하세요: ");
			int choice = input.nextInt();
			input.nextLine();
			
			switch(choice) {
			
			case 0:
				System.out.print("이름: ");
				name = input.nextLine();
				System.out.print("계좌번호: ");
				number = input.nextLine();
				System.out.print("비밀번호: ");
				pwd = input.nextLine();
				System.out.print("금액: ");
				balance = input.nextInt();
				input.nextLine();
				bank.createAccount(name, number, pwd, balance);
				break;
			
			case 1:
				System.out.print("계좌번호 입력하세요: ");
				number = input.nextLine();
				System.out.print("비밀번호 입력하세요: ");
				pwd = input.nextLine();
				bank.login(number, pwd);
				break;
			
			case 2:
				System.out.println("0: 입금	1: 출금	2. 이쳬	3: 잔액조회");
				System.out.print("업무를 선택하세요: ");
				idx = input.nextInt();
				input.nextLine();
				bank.process(idx);
				break;
				
			case 3:
				System.out.println("이용해주셔서 감사합니다.");
				flag = false;
				break;
			}
			
			System.out.println();
		}
		
		input.close();
	}
	

}
