package week11;

public class Book {
	private String title;
	private String author;
	private double price;
	private static int bookCount = 0; // 정적 변수: Book 인스턴스의 갯수를 저장

	// 생성자: 책 제목, 저자, 가격을 설정하여 Book 객체를 생성
	// Book 인스턴스 생성 시 bookCount 증가
	public Book(String title, String author,double price) {
		
	}
    

	// Getter 메소드: 책 제목 조회
	public String getTitle() {
		
	}

	// Getter 메소드: 가격 조회
	public double getPrice() {
		
	}
	
	/**
     * 정적 메소드: 생성된 Book 인스턴스의 갯수를 반환
     * @return 생성된 Book 인스턴스의 갯수
     */
    public static int getNumberOfBooks() {
        
    }
    
	/**
	 * @param originalPrice 원래 가격 (양수여야 함)
	 * @param discountRate 할인율 (0에서 1 사이의 값)
	 * 원래 가격이 0보다 작거나 할인율이 0보다 작거나 1보다 크다면 "유효하지 않은 가격 또는 할인율입니다." 출력 후 0을 반환
	 * @return 할인된 가격. 
	 */
	public double calculateDiscountedPrice(
			double originalPrice, double discountRate){

	}
}
