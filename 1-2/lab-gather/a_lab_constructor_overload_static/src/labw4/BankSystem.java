package labw4;

import java.util.Scanner;

public class BankSystem {

	private Account accounts[];
	private Account loggedIn = null;

	public BankSystem(int size) {
		accounts= new Account[size];//size of array
	}

	public Account getAccount(String number) {
		for (Account account : accounts) {
			if(account != null && account.getAccountNumber().equals(number)) {
				return account;
			}
		}
		return null;
	}

	public void createAccount(String name, String number, String pwd, int balance) {

		if (getAccount(number) != null) {
            System.out.println("입력한 계좌번호는 이미 존재합니다.");
            return;
        }

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = new Account(name, number, pwd, balance);
                System.out.println("계좌가 정상적으로 개설되었습니다.");
                return;
            }
        }
    }
	
	public void login(String number, String pwd) {
		Account account = getAccount(number);
		if (account != null && account.getPassword().equals(pwd)) {
			loggedIn = account;
			System.out.println(account.getName() + "님 환영합니다!");
		} else {
			System.out.println("계좌번호 또는 비밀번호가 일치하지 않습니다.");
		}
	}

	public void process(int idx) {

		if(loggedIn == null) { //if else to check log in first
			System.out.println("로그인 먼저 해주세요");
			return;
		}


		//if else업무

		if(idx==0) {
			//depo 업무
			Scanner input = new Scanner(System.in);
			System.out.print("입금할 금액을 입력하세요:"); //enter depo amt
			int depoamt = input.nextInt();

			if(loggedIn.deposit(depoamt)) {
				System.out.println(depoamt + "원 입금되었습니다. 잔액: " + loggedIn.getBalance());
			}else {
				System.out.println("잘못된 금액을 입력하였습니다.");
			} 

		}else if(idx==1) {
			//withdraw 업무
			Scanner input = new Scanner(System.in);
			System.out.print("출금할 금액을 입력하세요:"); //enter amount withdraw
			int withdrawamt = input.nextInt();

			if (loggedIn.withdraw(withdrawamt)) {
				System.out.println(withdrawamt + "원 출금되었습니다. 잔액: " + loggedIn.getBalance());
			} else {
				System.out.println("잔액이 부족하거나 잘못된 금액을 입력하였습니다.");
			}

		}else if(idx==2) {
			//transfer 업무
			Scanner input = new Scanner(System.in);
			System.out.print("이체할 계좌번호를 입력하세요:"); //emter acc num
			String targetAccountNumber = input.nextLine();

			Account targetAccount = getAccount(targetAccountNumber); //acc num same 

			if (targetAccount == null) {
				System.out.println("일치하는 계좌를 찾을 수 없어 이체를 실패하였습니다.");
				return;
			}

			System.out.print("이체할 금액을 입력하세요:"); //enter amt transfer
			int transferamt = input.nextInt();


			if (loggedIn.transfer(targetAccount, transferamt)) {
				System.out.println(targetAccount.getName() + "님의 계좌로 " + transferamt + "원을 이체하였습니다.");
			} else {
				System.out.println("잔액이 부족하거나 잘못된 금액을 입력하였습니다.");
			}

		}else if (idx == 3){
			System.out.println("잔액: " + loggedIn.getBalance() + "원");

		}else {
			System.out.println("잘못 된 idx.");
		}


	}

}
