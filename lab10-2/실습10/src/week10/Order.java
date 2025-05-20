package week10;

public class Order {
	private int appleQuantity;
    private int bananaQuantity;
    private int strawberryQuantity;

    public Order() {
       appleQuantity=0;
       bananaQuantity=0;
       strawberryQuantity=0;
    }
    //사과를 입력받으면 appleQuantity을 quantity만큼 추가
    //바나나를 입력받으면 bananaQuantity를 quantity만큼 추가
    //딸기를 입력받으면 strawberryQuantity를 quantity만큼 추가
    // 그 외를 입력받으면 "주문할 수 없는 상품입니다" 를 출력
    public void addItem(String productName, int quantity) {
    	if(productName.equals("사과")) {
    		appleQuantity= appleQuantity+quantity;
    		System.out.println(appleQuantity + "개의" + productName+ "가 주문에 추가되었습니다.");
    	} else if (productName.equals("바나나")) {
    		 bananaQuantity= bananaQuantity+quantity;
    		 System.out.println(bananaQuantity + "개의" + productName+ "가 주문에 추가되었습니다.");
    	} else if (productName.equals("딸기")) {
    		 strawberryQuantity=strawberryQuantity+quantity;
    		 System.out.println(strawberryQuantity + "개의" + productName+ "가 주문에 추가되었습니다.");
    	} else {
    		System.out.println("주문할 수 없는 상품입니다");
    	}
        
    }

    public void printOrderSummary() {
    	System.out.println("주문 내역:");
    	System.out.println("사과:"+ appleQuantity + " 개, 가격:" + getProductPrice("사과")* appleQuantity );
    	System.out.println("바나나:"+ bananaQuantity + "개, 가격:" + getProductPrice("바나나")* bananaQuantity );
    	System.out.println("딸기:"+ strawberryQuantity + "개, 가격:" + getProductPrice("딸기")* strawberryQuantity);
    	System.out.println("총 주문 금액:" + ((getProductPrice("사과")* appleQuantity) + (getProductPrice("바나나")* bananaQuantity)+ (getProductPrice("딸기")* strawberryQuantity)));
    	
        
    }
    
    // 간단한 예시로 고정된 상품 가격 반환
    // 사과는 1000원, 바나나는 1500원, 딸기는 2000원, 등록되지 않은 상품은 0원을 반환
    private int getProductPrice(String productName) {
   
    	if(productName.equals("사과")) {
    		return 1000;
    	} 
    	else if (productName.equals("바나나")) {
    		return 1500;
    	} 
    	else if (productName.equals("딸기")) {
    		return 2000;
    	} 
    	else {
    		return 0;
    	}
		
        
    }
}
