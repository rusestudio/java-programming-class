package _7장;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BadBank b1 = new BadBank();
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
		
		System.out.println("bad bank interest:" + b1.getInterestRate());
		System.out.println("normal bank interest:" + b2.getInterestRate());
		System.out.println("good bank interest:" + b3.getInterestRate());

	}

}
