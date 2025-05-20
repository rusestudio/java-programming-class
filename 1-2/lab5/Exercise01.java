package labw5;

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount savingsAccount = new SavingsAccount("홍길동", "1001", 100000, 0.3);
		System.out.println(savingsAccount); //print info acc to string saving
		savingsAccount.deposit(50000); //print depo acc
		savingsAccount.applyInterest(); //print balance intrest
		
		System.out.println();
		
		CheckingAccount checkingAccount = new CheckingAccount("홍길동", "1002", 200000, 100000);
		System.out.println(checkingAccount); //print info acc to string checking
		checkingAccount.withdraw(120000); //print limit withdraw checking acc
		checkingAccount.withdraw(100000); //print balance after withdraw in acc
		

	}

}
