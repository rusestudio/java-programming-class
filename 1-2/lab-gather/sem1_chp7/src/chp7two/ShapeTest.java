package chp7two;

public class ShapeTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape2 s1, s2, s3, s4;
		 s1 = new Shape2(); // ① 당연하다.
		 s2 = new Rectangle2(); // ② Rectangle 객체를 Shape 변수로 // 가리킬 수 있을까? Yes!!
		 
		// s3 = new Triangle();
		 s4 = new Circle2();
		 
		 //downcasting
		 Rectangle2 r;
		 Shape2 s;
		 s = new Rectangle2();
		 r = (Rectangle2)s;
		// r.width = 100;
		// r.height = 100;
		 
		// TODO Auto-generated method stub
			shapebinding sb1, sb2, sb3, sb4;
			sb1 = new shapebinding();
			sb2 = new Rectangle3();
			sb3 = new Triangle3();
			sb4 = new Circle3();
			sb1.draw(); // Shape의 draw() 메소드 호출
			sb2.draw(); // Rectangle의 draw() 메소드 호츨
			sb3.draw(); // Triangle의 draw() 메소드 호출
			sb4.draw(); // Circle의 draw() 메소드 호출
	}
	
}
