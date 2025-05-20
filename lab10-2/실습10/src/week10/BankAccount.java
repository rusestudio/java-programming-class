package week10;

public class BankAccount {
	private String accountNumber; //계좌번호
    private String ownerName; //예금주
    private double balance; //잔액

    public BankAccount(String accountNumber, String ownerName) {
         this.accountNumber= accountNumber;
         this.ownerName= ownerName;
         balance=0;
    }

    // 예금 처리
    public void deposit(double amount) {
        balance= amount+ balance;
        System.out.println(balance+"원을 예금했습니다.");
        
    }
    // 출금 처리
    public void withdraw(double amount) {
    	
    	if(amount > balance) {
    		System.out.println("잔액 부족합니다. 출금을 처리할 수 없습니다.");
    	} 
    	else {
    		balance= balance-amount;
        	System.out.println(balance+"원을 출금했습니다.");
    	}
    	
    }

    public double getBalance() {
        return balance;
    }

    public void printInfo() {
    	System.out.println("계좌 번호:"+ accountNumber);
    	System.out.println("예금주:"+ ownerName);
    	System.out.println("잔액:"+ balance);
    	
    	
    }
}
