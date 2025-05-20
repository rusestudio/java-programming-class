package latihan.examonline;

import java.util.ArrayList;

public class Society {
	
	String societyname;
	private ArrayList society;
	
	public Society(String societyname) {
		this.societyname= societyname;
		society = new ArrayList();
	}
	
	public void addMember(String name, String address) {
		Member member = new StandardMember (name,address);
		society.add(member);
	}
	
	public void addSeniorMember(String name, String address, int fee) {
		Member member = new SeniorMember(name, address, fee);
		society.add(member);
	}
	
	public void printAllMembers() 
	{ for (int i=0; i<society.size(); i++) 
	{ Member mb = (Member) society.get(i); 
	System.out.println("i = "+i+" Name= "+mb.getName()+ 
			" Address = "+mb.getAddress()+" Fees = "+mb.getFee()); 
	System.out.println("*********"); 
	} 
	} 
	
	public int getFeeTotal() {
		int totalFees=0;
		for (int i=0; i<society.size(); i++) {
			Member mb = (Member) society.get(i);
			totalFees += mb.getFee();
		
	}
		return totalFees;

}}
