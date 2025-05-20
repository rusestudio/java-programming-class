package week10;

public class BankAccountTest {
	public static void main(String[] args) {
        // 은행 계좌 생성 및 초기화
        BankAccount account1 = new BankAccount("123-456-789", "이승찬");

        // 계좌 정보 출력
        System.out.println("첫 번째 계좌 정보:");
        account1.printInfo();
        System.out.println();

        // 예금 처리
        account1.deposit(100000);
        System.out.println("잔액: " + account1.getBalance() + "원");
        System.out.println();

        // 출금 처리
        account1.withdraw(50000);
        System.out.println("잔액: " + account1.getBalance() + "원");
        System.out.println();

        // 출금 실패 (잔액 부족)
        account1.withdraw(80000);
        System.out.println("잔액: " + account1.getBalance() + "원");
    }
}
