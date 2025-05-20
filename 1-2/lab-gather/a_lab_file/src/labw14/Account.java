package labw14;

import java.io.Serializable;

//Account 클래스 수정
//Serializable 인터페이스를 구현하여 직렬화 가능하도록 수정
public class Account implements Serializable {
	
	private String name;
	private String accountNumber;
	private String password;
	protected int balance;
	
	public Account(String name, String accountNumber,String password,  int balance) {
		this.name= name;
        this.accountNumber= accountNumber;
        this.password= password;
        this.balance= balance;
	}
	
	public boolean deposit(int amount) {
			if(amount>=0) {
            balance += amount;
            return true;
			}
			return false;
	}
	
	public boolean withdraw(int amount) {
			if(amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
			}
			return false;
        }
	
	public boolean transfer (Account other, int amount) {
		if(withdraw(amount)) {
			other.deposit(amount);
            return true;
		}else {
			return false;
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
	

}
