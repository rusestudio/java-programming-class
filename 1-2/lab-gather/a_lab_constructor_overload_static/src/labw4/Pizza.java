package labw4;

public class Pizza {
	
	private String size;
	private String type;
	private int price;
	private static int count=0;
	
	public Pizza() { // basic constructor
		this("기본", "기본", 10000);
	}
	
	public Pizza(String size) { 
		this(size,"기본",10000);
	}
	
	public Pizza(String type, String size) {
		this(type,size,10000);
	}
	
	public Pizza(String size, String type, int price) { //overloading
		this.size=size;
		this.type=type;
		this.price= price;
		count = ++count;
	}
	
	public String toString() {
		return "Pizza [피자 종류:" + type + ", 사이즈: "+ size+ ", 가격: " + price+ "]";
	}
	
	public static int getCount() {
		return count;
	}

}
