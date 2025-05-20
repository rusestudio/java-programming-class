package _15장;

class OrderedPair<K,V>{
	
	private K key;
	private V value;
	
	public OrderedPair(K key,  V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
}

public class OrderedPairTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OrderedPair<String, Integer> p1 = 
				new OrderedPair<String, Integer>("my key", 123);
		
		OrderedPair<String, String> p2 = 
				new OrderedPair<String, String>("java", "programming");
		
		System.out.println(p1.getKey() + " " + p1.getValue());
		System.out.println(p2.getKey() + " " + p2.getValue());
		

	}

}
