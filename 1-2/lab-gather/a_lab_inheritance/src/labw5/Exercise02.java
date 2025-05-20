package labw5;

public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1 = new Account("홍길동","20240001", 10000);
		Account a2 = new Account("홍길동","20240001", 50000);
		SavingsAccount a3 =  new SavingsAccount("홍길동","20240001", 100000,0.03);
		Account a4 = new Account("홍길동","20240002", 10000);
		
		if(a1.equals(a2)) {
			System.out.println("a1과 a2는 동알한 계좌입니다.");
		}else {
			System.out.println("a1과 a2는 동알한 계좌가 아닙다.");
		}
		
		if(a1.equals(a3)) {
			System.out.println("a1과 a3는 동알한 계좌입니다.");
		}else {
			System.out.println("a1과 a3는 동알한 계좌가 아닙다.");
		}
		
		if(a1.equals(a4)) {
			System.out.println("a1과 a4는 동알한 계좌입니다.");
		}else {
			System.out.println("a1과 a4는 동알한 계좌가 아닙다.");
		}
			

	}

}
