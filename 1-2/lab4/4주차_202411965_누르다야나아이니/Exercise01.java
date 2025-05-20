package labw4;

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza p0 = new Pizza();
		Pizza p1 = new Pizza("medium");
		Pizza p2 = new Pizza("large","페퍼로니");
		Pizza p3 = new Pizza("small", "치즈", 8000);
		
		System.out.println(p0);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println("총 생성된 피자의 수: "+ Pizza.getCount());

	}

}
