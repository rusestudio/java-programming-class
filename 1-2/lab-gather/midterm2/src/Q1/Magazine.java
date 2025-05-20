package Q1;

public class Magazine extends Publication {
	
	int publication_cycle;
	
	//constructor
	public Magazine(String publishers, int pages, int prices, String titles, int publication_cycle) {
		super(publishers, pages, prices,titles);
		this.publication_cycle=publication_cycle;
	}
	
	//getter
    public int getPublication_cycle() {
    	return publication_cycle;
    }
    
    //setter
    public void setPublication_cycle(int publication_cycle) {
    	this.publication_cycle= publication_cycle;
    }
    
  //output method
  	public String publication_info() {
  		return super.toString()+ "Publication_cycle: " + this.publication_cycle; 
  		//plus cylcle
  	}
  	
}
