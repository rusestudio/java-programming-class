package latihan.examonline;

public class SeniorMember extends Member{
	
	int fee;
	
	public SeniorMember(String name, String address, int fee) {
		super(name, address);
		this.fee=fee;
	}
	
	public int getFee() {
		return fee;
	}

}
