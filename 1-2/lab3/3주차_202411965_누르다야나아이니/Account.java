package labw3;

public class Account {

	String accountNumber;
	String name;
	int balance;

	public void printinfo(String accountNumber, String name, int balance) {
		System.out.println("안녕하세요, "+ name);
		System.out.println(name+ "님의 계좌 "+ accountNumber+ "에는 " + balance+ "있습니다.");

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
		if(amount > balance) {
			return false;
		} else {
			balance= balance-amount;
		 return true;
		}
	
	}


}
