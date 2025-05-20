package labw5;

public class SavingsAccount extends Account {
	
	private double interestRate;
	
	public SavingsAccount(String name, String accountNumber, int balance, double interestRate) {
		super(name,accountNumber,balance);
		this.interestRate= interestRate;
	}
	
	public void applyInterest() {
		double rate= interestRate*balance/10;
		balance=(int)rate+balance;
		System.out.println("이자가 " + rate + "원 적용되었습니다. 잔액:"+ balance + "원");
		
	}
	
	public String toString() {
		return "저축 계좌 ["+ super.toString() +" 이자율:" + interestRate*10+ "%]";
	}

}
