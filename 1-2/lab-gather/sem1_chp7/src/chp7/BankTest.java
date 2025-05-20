package chp7;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				BadBank b1= new BadBank();
				NormalBank b2= new NormalBank();
				GoodBank b3= new GoodBank();
				
				System.out.println("BadBank interest rate:" + b1.getInterestRate());
				System.out.println("NormalBank interest rate:" + b2.getInterestRate());
				System.out.println("GoodBank interest rate:" + b3.getInterestRate());
				
			
	}

}
