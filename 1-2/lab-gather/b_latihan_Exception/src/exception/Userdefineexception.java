package exception;



class userdefineexceptiondetail extends Exception { //create class your exception
	
	public userdefineexceptiondetail() {
		super("user defined exception detail"); 
	}
		
}

public class Userdefineexception {
	
	
	public static void method1()  throws userdefineexceptiondetail //create fx method throw the exception
	{
		throw new userdefineexceptiondetail();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			method1();                             //throw exception
		} catch (userdefineexceptiondetail e) {    //catch exception that defined in class
			System.err.println(e.getMessage());
		}

	}

}
