package labw5;

public class Account {
	
	private String name;
	private String accountNumber;
	protected int balance;
	
	public Account (String name, String accountNumber, int balance) {
		this.name= name;
		this.accountNumber= accountNumber;
		this.balance= balance;
	}
	
	public void deposit(int amount) {
		if(amount>=0) {
			balance = balance+ amount;
		} System.out.println(amount + "원이 입금되었습니다. 잔액:" + balance + "원");
		
	}
	
	public void withdraw(int amount) {
		if(amount > balance) {
			System.out.println("잔액 보족");
		} else {
			balance= balance-amount;
	    }System.out.println(amount + "원이 출금되었습니다. 잔액:" + balance + "원");
	}
	
	public String toString() {
		return "예금주:" +name+ ",계좌번호:"+ accountNumber+ ",잔액:"+ balance+ "원";
	}
	
	public boolean equals(Account accnum) {
		if (accnum instanceof Account) {
		    return accountNumber.equals(((Account)accnum).accountNumber);
		}else {
			return false;
		

}
	}
	
}
