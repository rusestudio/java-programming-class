package labw12;

import java.util.Scanner;

public class BankSystem {
    private Account accounts[];
    private Account loggedIn;

    public BankSystem(int size) {
        accounts = new Account[size];
        loggedIn = null;
    }

    public Account getAccount(String number) throws AccountNotFoundException {
        for (Account account : accounts) {
            if (account == null) {
				break;
			} else if (account != null && account.getAccountNumber().equals(number)) {

            }
           return account;
            //throw new AccountNotFoundException("Account not found: " + number);
        }
        //return account;
        throw new AccountNotFoundException("Account not found: " + number);
    }

    public void createAccount(String name, String number, String pwd, int balance) throws AccountException {
        if (getAccount(number) != null) {
            throw new DuplicateAccountException("입력한 계좌번호는 이미 존재합니다.");
        } else if (Account.getCount() < accounts.length) {
            accounts[Account.getCount()] = new Account(name, number, pwd, balance);
            System.out.println("계좌가 정상적으로 개설되었습니다.");
        }
    }

    public void login(String number, String pwd) throws AccountException {
        Account account = getAccount(number);
        if (account != null && account.getPassword().equals(pwd)) {
            System.out.println(account.getName() +"님, 환영합니다");
            loggedIn = account;
        } else {
            throw new AuthenticationFailedException("계좌번호 또는 비밀번호가 일치하지 않습니다.");
        }
    }

    public void process(int idx) throws AccountException, AmountException {
        if (loggedIn == null) {
            throw new AccountException("로그인 먼저 해주세요");
        }

        Scanner input = new Scanner(System.in);
        int amount = 0;

        switch (idx) {
            case 0: // deposit
                System.out.print("입금할 금액을 입력하세요: ");
                amount = input.nextInt();
                if (loggedIn.deposit(amount)) {
					System.out.println(amount + " 원 입금되었습니다. 잔액:  " + loggedIn.getBalance());
				} else {
					throw new InvalidAmountException("잘못된 금액을 입력하였습니다.");
				}
                break;

            case 1: // withdraw
                System.out.print("출금할 금액을 입력하세요: ");
                amount = input.nextInt();
                if (loggedIn.withdraw(amount)) {
					System.out.println(amount + " 원 출금되었습니다. 잔액: " + loggedIn.getBalance());
				} else {
					throw new InsufficientBalanceException("잔액이 부족하거나 잘못된 금액을 입력하였습니다.");
				}
                break;

            case 2: // transfer
                System.out.print("이체할 계좌번호를 입력하세요: ");
                String number = input.nextLine();
                System.out.println("이제할 금액을 입력하세요: ");
                amount = input.nextInt();
                Account account = getAccount(number);

                if(account == null) {
                	throw new AccountNotFoundException("일치하는 계좌를 찾을 수 없어 이체를 실패하였습니다");
                }
                else if (loggedIn.transfer(account, amount)) {
                    System.out.println(amount + " transferred to " + account.getName() + "'s account.");
                } else {
                    throw new InsufficientBalanceException("잔액이 부족하거나 잘못된 금액을 입력하였습니다.");
                }
                break;

            case 3: // check balance
                System.out.println("Balance: " + loggedIn.getBalance());
                break;
        }
    }
}