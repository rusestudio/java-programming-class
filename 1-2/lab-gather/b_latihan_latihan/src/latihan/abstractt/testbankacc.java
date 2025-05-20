package latihan.abstractt;

public class testbankacc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ibal,damt,wamt; //amount
		
        ibal = 1000.00; //initial amount
        SavingAcc savingsAccount = new SavingAcc("SA001", ibal);
		System.out.println("Savings A/c: Initial Balace: $"+ibal);
		
		damt = 500.00; //deposit amount
        savingsAccount.deposit(damt);
        
		wamt = 250.00; //withdraw amount
        savingsAccount.withdraw(wamt);
        
		wamt = 1600.00;
		System.out.println("\nTry to withdraw: $"+wamt);
        savingsAccount.withdraw(wamt);

        System.out.println();
        
        ibal = 5000.00;
        CurrentAccount currentAccount = new CurrentAccount("CA001", ibal);
		System.out.println("Current A/c: Initial Balace: $"+ibal);
		
		damt = 2500.00;
        currentAccount.deposit(1000.0);
        
		wamt = 1250.00;
        currentAccount.withdraw(3000.0);
        
		wamt = 6000.00;
		System.out.println("\nTry to withdraw: $"+wamt);
        savingsAccount.withdraw(wamt);	
	}
}

