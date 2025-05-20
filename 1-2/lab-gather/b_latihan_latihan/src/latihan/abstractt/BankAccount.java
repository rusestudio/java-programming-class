package latihan.abstractt;

abstract class BankAccount {
	
	private String accNo;
	private double balance;
	
	public BankAccount(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public String getaccNo() {
        return accNo;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

	
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	
}
//child class
class SavingAcc extends BankAccount{
	
	public SavingAcc(String accNo, double balance) {
		super(accNo, balance);
	}
	
	void deposit(double amount) {
		 setBalance(getBalance() + amount);
	        System.out.println("Deposit of $" + amount 
	        + " successful. Current balance: $" + getBalance());
	    }
	
	
    void withdraw(double amount) {
    	if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount 
            + " successful. Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
	}

}
//child class
class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount 
        + " successful. Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount 
            + " successful. Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}
