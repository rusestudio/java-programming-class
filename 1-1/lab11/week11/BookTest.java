package week11;

public class BookTest {
	public static void main(String[] args) {
        // Book 객체 생성
        Book book1 = new Book("자바의 정석", "남궁성", 30000);
        
        System.out.println("생성된 책의 갯수는: " + Book.getNumberOfBooks());
        // 할인된 가격 계산 및 출력
        double originalPrice = book1.getPrice();
        double discountRate = 0.1; // 10% 할인
        double discountedPrice = book1.calculateDiscountedPrice(originalPrice, discountRate);

        System.out.println(book1.getTitle() + "의 원래 가격: " + originalPrice + "원");
        System.out.println("할인율 " + (discountRate * 100) + "% 적용 후 가격: " 
        												+ discountedPrice + "원");
    }
}
