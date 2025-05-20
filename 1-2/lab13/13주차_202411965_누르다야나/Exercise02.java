package labw13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//➢ Alignment uses the List.sort() or Collections.sort() method use lambda instead of compareTo() method

class BankManager {
	
	//동일 계좌가 없으면 추가
	//method to add an account with the same account number if it is not on the list
	//> Create to handle only limited types of objects using generics
	//> Generic type parameters must be used to match the list with the type of account to be added
	public static <T extends Account> void addAccount(List<T> accounts, T a) {
	    boolean accountExists = false;
	    for (T account : accounts) {
	        if (account.equals(a)) {
	            accountExists = true;
	            break;
	        }
	    }
	    if (!accountExists) {
	        accounts.add(a);
	    }
	}
	
	//전체 걔좌 출력
    //method to print the entire account
    //> Utilize wildcards to enable the type of list to include Account or its subclasses
	public static void printAccounts(List<? extends Account> accounts) {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
	
	//저축 계좌만 출력 
	// a method of printing only savings accounts in the order of the highest interest rates
	//> Utilize wildcards to enable the type of list to include SavingsAccount or higher classes
	public static void printSavingAccounts(List<? extends Account> accounts) {
        List<SavingsAccount> savingAccounts = new ArrayList<>();
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                savingAccounts.add((SavingsAccount) account);
            }
        }
        Collections.sort(savingAccounts, (a1, a2) -> Double.compare(a2.getInterestRate(), a1.getInterestRate()));
        for (SavingsAccount account : savingAccounts) {
            System.out.println(account);
        }
    }
	//입출금 계좌만 출력
	//A method of filtering only deposit and withdrawal accounts and outputting them in the order of the highest balance
	//> Utilize wildcards to enable the type of list to include CheckingAccount or higher classes
	public static void printCheckingAccounts(List<? extends Account> accounts) {
        List<CheckingAccount> checkingAccounts = new ArrayList<>();
        for (Account account : accounts) {
            if (account instanceof CheckingAccount) {
                checkingAccounts.add((CheckingAccount) account);
            }
        }
        Collections.sort(checkingAccounts, (a1, a2) -> Integer.compare(a2.getBalance(), a1.getBalance()));
        for (CheckingAccount account : checkingAccounts) {
            System.out.println(account);
        }
    }
	//총 잔액 계산
	//Method of returning the total balance of the entire account
	//> Utilize wildcards to enable the type of list to include Account or its subclasses
	//총 잔액 계산
	//Method of returning the total balance of the entire account
	//> Utilize wildcards to enable the type of list to include Account or its subclasses
	public static int calculateTotalBalance(List<? extends Account> accounts) {
	    int totalBalance = 0;
	    for (Account account : accounts) {
	        totalBalance += account.getBalance();
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
