package labw7;

public class Product implements Comparable {

 private String name;
 private int price;
 private double rating;
 
 public Product(String name, int price, double rating) {
	 this.name= name;
	 this.price=price;
	 this.rating=rating;
 }
 
 @Override
 public String toString() {
	 return "상품명: " + name + " , 가격: " +price+ " , 평점: "+ rating;
 }

@Override
public int compareTo(Object other) {
	// TODO Auto-generated method stub
	Product otherProduct = (Product) other;
	
	if(this.price == otherProduct.price) { //price same
		if(this.rating > otherProduct.rating) //compare rating
			return -1;
		else if (this.rating < otherProduct.rating)
			return 1;
		else 
			return 0;	
	} else if(this.price > otherProduct.price) {
		//otherProduct.price- this.price 내림차순 정렬 ascending sort
		return 1;
		
	} else{
		//this.price-otherProduct.price 오름차순 정렬 ascending sort
		return -1;
	}
	
 
}
}
