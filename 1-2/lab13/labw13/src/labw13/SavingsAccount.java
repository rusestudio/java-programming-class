package labw13;

public class SavingsAccount extends Account {
	private double interestRate;
	
	public SavingsAccount(String name, String accountNumber, int balance, double interestRate) {
        super(name, accountNumber, balance);
        this.interestRate = interestRate;
    }
	
	public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("이자가: " + interest + "원 적응되었습니다. 잔액: " + balance + "원");
    }

    @Override
    public String toString() {
        return "저축 계좌 [" + super.toString() + "이자율:" + (interestRate*100)+ "%]";
    }

	public double getInterestRate() {
		// TODO Auto-generated method stub
		return interestRate;
	}
}
