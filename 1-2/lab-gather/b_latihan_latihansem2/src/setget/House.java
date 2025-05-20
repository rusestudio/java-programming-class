package setget;

public class House {
	
	private String address;
	private int room;
	private double area;
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address= address;
	}
	
	public int getRoom() {
		return room;
	}
	
	public void setRoom(int room) {
		this.room= room;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area= area;
	}
	
	public double calculatePrice( double pricepersqr) {
		return this.area* pricepersqr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//make obj
		House h = new House();
		
		//set house info
		h.setAddress("tgy-137");
		h.setRoom(3);
		h.setArea(130.5);
		
		//calc price house per sqr
        double price = h.calculatePrice(2000);
        
        //print detail use getter
        System.out.println("Address: " + h.getAddress());
        System.out.println("Number of Rooms: " + h.getRoom());
        System.out.println("Area: " + h.getArea() + " sq meters");
        System.out.println("Price: $" + price);
	}

}
