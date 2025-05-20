package Q1;

public class KidsMagazine extends Magazine {
	
	int age;
	
	//constructor
	public KidsMagazine(String publishers, int pages, int prices, String titles, int publication_cycle, int age){
		super(publishers,pages,prices,titles,publication_cycle);
		this.age=age;
	}
	
	//getter
	public int getAge() {
		return age;
	}
	
	//setter
	public void setAge(int age) {
		this.age=age;
	}
	
	//output method
		public String publication_info() {
			return super.toString()+ "Age:"+ this.age;
		}
		//plus age

}
