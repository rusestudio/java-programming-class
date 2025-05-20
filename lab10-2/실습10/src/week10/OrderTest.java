package week10;

public class OrderTest {
	 public static void main(String[] args) {
	        Order order = new Order();

	        order.addItem("사과", 2);
	        
	        order.addItem("바나나", 3);
	        
	        order.addItem("딸기", 1);
	    
	        order.printOrderSummary();
	    }
}
