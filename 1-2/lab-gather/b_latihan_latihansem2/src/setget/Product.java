package setget;

public class Product {
	
	private String productName;
    private String productCode;
    private double price;
    private double originalPrice;  // Add this to store the original price
    
    public String getProductName() {
        return productName;
    }
    
    public String getProductCode() {
        return productCode;
    }
    
    public double getPrice() {
        return price;
    }
    
    public double getOriginalPrice() {  // Add a method to get the original price
        return originalPrice;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    
    public void setPrice(double price) {
        this.price = price;
        this.originalPrice = price;  // Store the original price when setting the price
    }
	
	public void applyDiscount(double percentage) {
		if(percentage >0 && percentage <=100) {
			this.price -= this.price*(percentage/100);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create product
		Product p = new Product();
		
		//set product info
		p.setProductName("laptop");
		p.setProductCode("1267");
		p.setPrice(1999.90);
		
		//apply discounnnt %
		p.applyDiscount(8);
		
		//print info use get
		 System.out.println("Product Name: " + p.getProductName());
	     System.out.println("Product Code: " + p.getProductCode());
	     System.out.println("Price before discount: $" + p.getOriginalPrice());
	     System.out.println("Price after discount: $" + p.getPrice());
		
		

	}

}
