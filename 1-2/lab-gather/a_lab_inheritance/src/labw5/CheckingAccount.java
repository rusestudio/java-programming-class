package labw5;

public class CheckingAccount extends Account{
	
	private int withdrawLimit;
	
	public CheckingAccount(String name, String accountNumber, int balance, int withdrawLimit) {
		super(name,accountNumber,balance);
		this.withdrawLimit= withdrawLimit;
	}
	
	public void withdraw(int amount) {
		if(amount > withdrawLimit) {
			System.out.println("출금 한도를 초과했습니다. 출금 한도: "+ withdrawLimit+ "원");
		} else{
			super.withdraw(amount);
		}
	}
	
	public String toString() {
		return"입출금 계좌 ["+ super.toString() +", 출금 한도:"+ withdrawLimit +"]";
	}

}
