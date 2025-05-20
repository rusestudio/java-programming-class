package latihan.examonline;

public class ISBN {
	
	public int countryNum;
	public int publisherNum;
	public int titleNum;
	public int checkDigit;
	
	//constructor for obj of class ISBN
	public ISBN() {
		countryNum=0;
		publisherNum=0;
		titleNum= 0;
		checkDigit=0;
	}
	
	//method to return ISBN as string
	public String getISBN() {
		 return countryNum + " " + publisherNum + 
				 " " +titleNum+ " " + checkDigit;
	}
	
	//method to set ISBN of book
	public void setISBN(int n1, int n2, int n3, int n4) {
		countryNum=n1;
		publisherNum=n2;
		titleNum=n3;
		checkDigit=n4;
	}
	
	
	

	
}
