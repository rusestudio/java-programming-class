package labw14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankSystem {
    
    private List<Account> accounts;
    private Account loggedIn;
    private static final String FILE_PATH = "resources/accounts.dat";

    public BankSystem() {
        accounts = new ArrayList<>();
        loggedIn = null;
        loadAccounts();
    }

  

    public Account getAccount(String number) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(number)) {
                return account;
            }
        }
        return null;
    }

    public void createAccount(String name, String number, String pwd, int balance) {
        if (getAccount(number) != null) {
            System.out.println("입력한 계좌번호는 이미 존재합니다");
        } else {
            Account newAccount = new Account(name, number, pwd, balance);
            accounts.add(newAccount);
            System.out.println("계좌가 정상적으로 개설되었습니다.");
            saveAccounts();
        }
    }

    public void login(String number, String pwd) {
        Account account = getAccount(number);
        if (account != null && account.getPassword().equals(pwd)) {
            System.out.println(account.getName() + "님, 환영합니다");
            loggedIn = account;
        } else {
            System.out.println("계좌번호 또는 비밀번호가 일치하지 않습니다.");
        }
    }

    public void process(int idx) {
        if (loggedIn == null) {
            System.out.println("로그인 먼저 해주세요");
            return;
        }

        Scanner input = new Scanner(System.in);
        int amount = 0;

        switch (idx) {
            case 0: // deposit
                System.out.print("입금할 금액을 입력하세요: ");
                amount = input.nextInt();
                if (loggedIn.deposit(amount)) {
                    System.out.println(amount + " 원 입금되었습니다. 잔액: " + loggedIn.getBalance());
                    saveAccounts();
                } else {
                    System.out.println("잘못된 금액을 입력하였습니다.");
                }
                break;
            case 1: // withdraw
                System.out.print("출금할 금액을 입력하세요: ");
                amount = input.nextInt();
                if (loggedIn.withdraw(amount)) {
                    System.out.println(amount + " 원 출금되었습니다. 잔액: " + loggedIn.getBalance());
                    saveAccounts();
                } else {
                    System.out.println("잔액이 부족하거나 잘못된 금액을 입력하였습니다.");
                }
                break;
            case 2: // transfer
                System.out.print("이체할 계좌번호를 입력하세요: ");
                String number = input.next();
                System.out.print("이체할 금액을 입력하세요: ");
                amount = input.nextInt();
                Account account = getAccount(number);
                if (account == null) {
                    System.out.println("일치하는 계좌를 찾을 수 없어 이체를 실패하였습니다");
                } else if (loggedIn.transfer(account, amount)) {
                    System.out.println(account.getName() + "님의 계좌로 " + amount + "원을 이체하였습니다.");
                    saveAccounts();
                } else {
                    System.out.println("잔액이 부족하거나 잘못된 금액을 입력하였습니다.");
                }
                break;
            case 3: // check balance
                System.out.println("잔액: " + loggedIn.getBalance() + "원");
                break;
        }
    }
        
        private void loadAccounts() {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
                accounts = (List<Account>) ois.readObject();
            } catch (ClassNotFoundException e) { 
            	accounts = new ArrayList<Account>();
                System.out.println("계좌 데이터 파일을 찾을 수 없습니다. 새로운 리스트를 생성합니다.");
            } catch (IOException e) {
            	accounts = new ArrayList<Account>();
                System.out.println("계좌 데이터를 로드하는 중 오류가 발생했습니다. 새로운 리스트를 생성합니다.");
            }
        }

        private void saveAccounts() {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
                oos.writeObject(accounts);
            } catch (IOException e) {
                System.out.println("계좌 데이터를 저장하는 중 오류가 발생했습니다: " + e.getMessage());
            }
        }
    
}