package Q1;

public class Publication {
	
	String publishers;
	int pages;
	int prices;
	static String titles;
	
	//constructor
	public Publication(String publishers, int pages, int prices, String titles){
		this.publishers= publishers;
		this.pages= pages;
		this.prices=prices;
		this.titles= titles;
	}
	
	//getter
	public String getPublishers() {
		return publishers;
	}
	
	public int getPages() {
		return pages;
	}
	
	public int getPrices() {
		return prices;
	}
	
	public static String getTitles() {
		return titles;
	}
	
	//setter
	public void setPublishers(String publishers) {
		this.publishers=publishers;
	}
	
	public void setPages(int pages) {
		this.pages= pages;
	}
	
	public void setPrices(int prices) {
		this.prices= prices;
	}
	
	public void setTitles(String Titles) {
		this.titles=titles;
	}
	
	//output method
	public String publication_info() {
		return "Publishers: " + this.publishers + ", "
				+ "Pages: " + this.pages + ","
						+ "Prices: " + this.prices + " "
								+ "Titles:"+ this.titles;
	}
	

}
