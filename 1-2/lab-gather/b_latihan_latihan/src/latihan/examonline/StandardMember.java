package latihan.examonline;

public class StandardMember extends Member{
	
	public StandardMember(String name, String address) {
		super(name,address);
	}
	
	@Override
	public int getFee() {
		return 30;
	}

}
