package latihan.examonline;

public class Address {
	
	public String street;
	public int house;
	public String city;
	
	public Address() {
		street = "Unknown";
		 house = 0;
		 city = "Unknown"; 
	}
	
	public String getStreet() {
		return street;
	}
	
	public int getHouse() {
		return house;
	}
	
	public String getCity() {
		return city;
	}
	
	public void changeAddress(String street, int house, String city)
	{ this.street = street;
	 this.house = house;
	 this.city = city; 
	}
}
