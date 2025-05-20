package labw13;

import java.util.Objects;

public class Account {
	
	private String name;
	private String accountNumber;
	protected int balance;
	
	public Account(String name, String accountNumber, int balance) {
		this.name= name;
        this.accountNumber= accountNumber;
        this.balance= balance;
	}
	
	public void deposit(int amount) {
			if(amount>=0) {
            balance += amount;
            System.out.println(amount + "원이 입금되었습니다. 잔액: " + balance + "원");
        } else {
            System.out.println("잘못된 금액을 입력하였습니다.");
        }
	}
	
	public void withdraw(int amount) {
			if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다. 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족하거나 잘못된 금액을 입력하였습니다.");
        }
	}
	
	
	public String toString() {
		return "에금주: " + name + ", 계좌번호: " + accountNumber + ", 잔액: " + balance + "원";
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof Account)) return false;
		return Objects.equals(this.accountNumber, ((Account)obj).accountNumber);
	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	
	

}
