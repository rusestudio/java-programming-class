package latihan.examonline;

public abstract class Member {
	
	String name;
	String address;
	
	public Member(String name, String address) {
		this.name= name;
		this.address= address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public abstract int getFee();

}
