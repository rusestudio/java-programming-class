package justprac;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LabBook book = new LabBook ("OOP",75.00);
	}

}
class Book{
	private String title;
	public Book (String t) {
		title= t;
		System.out.println(title);
	}
}
class LabBook extends Book {
	private double price;
	public LabBook(String t, double p) {
		super(t);
		price= p;
		System.out.println(price);
	}
}
