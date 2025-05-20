package week10;

public class Order {
	private int appleQuantity;
    private int bananaQuantity;
    private int strawberryQuantity;

    public Order() {
        
    }
    //사과를 입력받으면 appleQuantity을 quantity만큼 추가
    //바나나를 입력받으면 bananaQuantity를 quantity만큼 추가
    //딸기를 입력받으면 strawberryQuantity를 quantity만큼 추가
    // 그 외를 입력받으면 "주문할 수 없는 상품입니다" 를 출력
    public void addItem(String productName, int quantity) {
        
    }

    public void printOrderSummary() {
        
    }
    
    // 간단한 예시로 고정된 상품 가격 반환
    // 사과는 1000원, 바나나는 1500원, 딸기는 2000원, 등록되지 않은 상품은 0원을 반환
    private int getProductPrice(String productName) {
        
    }
}
