package labw4;

public class Account {
	
	private String name;
	private String accountNumber;
	private String password;
	private int balance;
	private static int count=0;

	public Account(String name, String accountNumber, String password, int balance) {
		this.name= name;                   //constructor
		this.accountNumber= accountNumber;
		this.password= password;
		this.balance= balance;
		count = ++count;
	}
	
	public boolean deposit(int amount) { // calc depo
		if(amount>=0) {
			balance= amount + balance;
		} else {
			return false;
		}
		return true;
	}
	
	public boolean withdraw(int amount) {  // calc withdraw
		if(amount > balance) {
			return false;
		}else if(amount < 0) {
			return false;
		}else {
			balance= balance-amount;
		 return true;
		}
	}
	
	public boolean transfer(Account other, int amount) { //calc transfer
		if(amount > balance) {
			return false;
		}else if(amount < 0) {
			return false;
		}else{
            balance -= amount;
            other.deposit(amount);
            return  true;
        }
	}
	
	public String getName() {
		return name;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public static int getCount() {
		return count;
	}

}
