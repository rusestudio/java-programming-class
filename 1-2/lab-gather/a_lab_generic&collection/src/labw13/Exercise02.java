package labw13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class BankManager {
	
	//동일 계좌가 없으면 추가
	public static <T extends Account> void addAccount(List<T> accounts, T a) {
		//<T extends Account> restricts the type T to be either 
        //Account or its subclasses (SavingsAccount, CheckingAccount).
	    boolean accountExists = false;
	  
	    for (T account : accounts) {
	        if (account.equals(a)) {
	            accountExists = true; 
	            break;
	        }
	    }
	    if (!accountExists) {
	        accounts.add(a);
	        //Adds an account to the list only if 
            //an account with the same accountNumber does not already exist.
	    }
	    
	    
	}
	
	//전체 걔좌 출력
	public static void printAccounts(List<? extends Account> accounts) {
		//can print list of Account class or saving or checkin. all subclass
		//<?> wildcard use to contain list of Account or any subclass
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
	
	//저축 계좌만 출력 
	// a method of printing only savings accounts in the order of the highest interest rates
	public static void printSavingAccounts(List<? extends Account> accounts) {
		
        List<SavingsAccount> savingAccounts = new ArrayList<>();//list for saving accounts,
        
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                savingAccounts.add((SavingsAccount) account); //filter list for only saving accounts
            }
        }
        
        Collections.sort(savingAccounts, (a1, a2) -> 
        Double.compare(a2.getInterestRate(), a1.getInterestRate())); //sort by interest rate ascending
        
        for (SavingsAccount account : savingAccounts) {
            System.out.println(account);      //print saving account
        }
    }
	//입출금 계좌만 출력
	public static void printCheckingAccounts(List<? extends Account> accounts) {
		
        List<CheckingAccount> checkingAccounts = new ArrayList<>();//list for checking accounts only
        
        for (Account account : accounts) {
            if (account instanceof CheckingAccount) {
                checkingAccounts.add((CheckingAccount) account);// only filter checking account
            }
        }
        
        Collections.sort(checkingAccounts, (a1, a2) -> 
        Integer.compare(a2.getBalance(), a1.getBalance())); //sort checking acc by balance
        
        
        for (CheckingAccount account : checkingAccounts) {
            System.out.println(account);  //print sorted checking acc
        }
    }
	//총 잔액 계산
	public static int calculateTotalBalance(List<? extends Account> accounts) {
		//? wildcard accept  any list containing Account or its subclasses.
	    int totalBalance = 0;
	    
	    for (Account account : accounts) {        //loop each account
	        totalBalance += account.getBalance(); //add the total balance
	    }
	    return totalBalance;
	}
	
}



public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Account> accounts = new ArrayList<>();
        BankManager.addAccount(accounts, new SavingsAccount("홍길동", "20240001-1", 1000000, 0.05));
        BankManager.addAccount(accounts, new CheckingAccount("홍길동", "20240001-2", 100000, 100000));
        BankManager.addAccount(accounts, new CheckingAccount("홍길동", "20240001-3", 500000, 100000));
        BankManager.addAccount(accounts, new SavingsAccount("홍길동", "20240001-3", 5000, 0.07));
        BankManager.addAccount(accounts, new SavingsAccount("홍길동", "20240001-4", 1000000, 0.08));
		
		System.out.println("전체 계좌: ");
		BankManager.printAccounts(accounts);
		System.out.println();
		
		System.out.println("저축 계좌 (이자율 높은 손): ");
		BankManager.printSavingAccounts(accounts);
		System.out.println();
		
		System.out.println("입출금 계좌 (잔액 높은 손): ");
		BankManager.printCheckingAccounts(accounts);
		System.out.println();
		
		int totalBalance = BankManager.calculateTotalBalance(accounts);
		System.out.println("전체 계좌 총 잔액: " + totalBalance + "원");
		System.out.println();
		
		

	}

}
