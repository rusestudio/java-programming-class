package chp6;

public class Account {
	
	private int regNumber;
	private String name;
	private int balance;
	
	public int getRegNumber() 
	{ 
		return regNumber; 
	}
	
	public void setRegNumber(int regNumber)
	{
		this.regNumber = regNumber; //this is- show to the method. 해당 현재 겍체
	}
	
	public String getName() 
	{ 
		return name; 
	}
	
	
	public void setName(String name) 
	{ 
		this.name = name; 
	}
	
	public int getBalance() 
	{ 
		return balance; 
	}
	
	public void setBalance(int balance) 
	{ 
		this.balance = balance; 
	}

}
