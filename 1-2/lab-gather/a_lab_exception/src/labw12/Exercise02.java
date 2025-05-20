package labw12;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankSystem bank = new BankSystem(100);

        String number, name, pwd;
        int balance, idx;
        boolean flag = true;

        System.out.println("=======menu======");
        System.out.println("0. 계좌 개설");
        System.out.println("1. 계좌 로그인(재로그인)");
        System.out.println("2. 입출금/이체/조회");
        System.out.println("3. 종료");
        System.out.println("=================");

        while (flag) {
            System.out.print("메뉴 선택: ");
            int choice = input.nextInt();
            input.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 0:
                        System.out.print("이름: ");
                        name = input.nextLine();
                        assert !name.isEmpty() : "이름은 비어있거나 공백일 수 없습니다. ";
                        System.out.print("계좌번호: ");
                        number = input.nextLine();
                        assert number.matches("\\d+") : "올바르지 않은 계좌번호 형식:"+ number; //계좌 번호는 숫자로만 이뤄져야 함
                        System.out.print("비밀번호: ");
                        pwd = input.nextLine();
                        assert !pwd.isEmpty() : "비밀번호은 비어있거나 공백일 수 없습니다.";
                        System.out.print("금액: ");
                        balance = input.nextInt();
                        assert balance >= 0 : "초기 금액은 0 이상이어야 합니다.:" + balance;
                        input.nextLine();

                        bank.createAccount(name, number, pwd, balance);
                        break;

                    case 1:
                        System.out.print("계좌번호를 입력하세요: ");
                        number = input.nextLine();
                        System.out.print("비밀번호를 입력하세요: ");
                        pwd = input.nextLine();
                        bank.login(number, pwd);
                        break;

                    case 2:
                        System.out.print("0:입금  1:출금  2:이체  3:잔액조회  ");
                        System.out.print("업무를 선택하세요: ");
                        idx = input.nextInt();
                        input.nextLine();
                        bank.process(idx);
                        break;

                    case 3:
                        System.out.println("이용해주셔서 감사합니다.");
                        flag = false;
                        break;
                }
            } catch (AccountException | AmountException e) {
                System.err.println("Error: " + e.getMessage());
            } catch (AssertionError e) {
                System.err.println("AssertionError:"+  e.getMessage());
            }

            System.out.println();
        }

        input.close();
    }
}
