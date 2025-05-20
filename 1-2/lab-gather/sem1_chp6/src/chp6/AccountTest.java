package chp6;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account obj = new Account();
		
		obj.setName("Tom"); //since name is private so use setname to change the name value
		
		obj.setBalance(100000);
		
		System.out.println("이름은 " + obj.getName() + " 통장 잔고는 " //use get name to print bcoz name is private
		+ obj.getBalance() + "입니다.");

	}

}
