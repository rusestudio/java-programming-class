package week11;

public class BoxTest {

	public static void main(String[] args) {
		Box box1 = new Box(1, 3, 4);
		Box box2 = new Box(2, 1, 3);
		
		Box result = box1.compare(box1, box2);
		
		System.out.println("사과의 갯수는: " + result.apple + " 오렌지의 갯수는: " + result.orange);

	}

}
