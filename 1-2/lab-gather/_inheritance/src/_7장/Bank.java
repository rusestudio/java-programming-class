package _7장;

public class Bank {
	
	public double getInterestRate() {
		return 0.0;
	}

}

class BadBank extends Bank {
	
	public double getInterestRate() { //override method
		return 10.0;
	}

}

class NormalBank extends Bank {
	
	public double getInterestRate() { //override method
		return 5.0;
	}

}


class GoodBank extends Bank {
	
	public double getInterestRate() { //override method
		return 3.0;
	}

}
