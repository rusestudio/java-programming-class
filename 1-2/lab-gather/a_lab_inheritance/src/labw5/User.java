package labw5;

public abstract class User {
	
	protected String name;
	private String id;
	private String password;
	
	public User(String name, String id, String password) {
		this.name= name;
		this.id=id;
		this.password= password;
	}
	

	public abstract void printRole();
	
	public boolean login(String id, String pwd) {
		return this.id.equals(id) && this.password.equals(pwd);
	}

}
