package _15장;

class Box<T>{
	private T data;
	
    public void set(T data) {
        this.data = data;
    }
    
    public T get() {
        return data;
    }
}
public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box<String> b = new Box<String>();
        b.set("Hello, World!");
        String s = b.get();
        System.out.println(s);
        
        Box<Integer> b2 = new Box<Integer>();
        b2.set(50);
        int i = b2.get();
        System.out.println(i);

	}

}
