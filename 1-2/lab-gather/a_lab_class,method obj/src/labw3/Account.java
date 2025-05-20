package labw3;

public class Account {

	String accountNumber;
	String name;
	int balance;

	public Account(String accountNumber, String name, int balance) {
		this.accountNumber= accountNumber;
		this.name= name;
		this.balance=balance;
	}
	
	public void printinfo() {
	    System.out.println("안녕하세요, " + this.name);
	    System.out.println(this.name + "님의 계좌 " + this.accountNumber + "에는 " + this.balance + " 있습니다.");
	}


	//only calc
	public boolean deposit(int amount) {
		if(amount>=0) {
			balance= amount + balance;
		} else {
			return false;
		}
		return true;


	}

	public boolean withdraw(int amount) {
		// only calc
		if(amount > 0 && balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	
	}


}
