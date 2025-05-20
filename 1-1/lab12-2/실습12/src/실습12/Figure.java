package 실습12;

public class Figure {

	public static class Shape {
		public double width; // 도형의 너비
		public double height; // 도형의 높이

		// Shape 클래스의 생성자
		public Shape(double width, double height) {
        this.width= width;
        this.height= height;
		}
	}

	//child class
	public static class Triangle extends Shape {
		public Triangle(double width, double height) {
        super(width,height);
		}

		public double calculateArea() {
        
			return (width*height)/2.0;
		}
	}

	//child class
	public static class Rectangle extends Shape {
		public Rectangle(double width, double height) {
			super(width,height);
		}

		public double calculateArea() {
	   
		   return width*height;
		}
	}

	public static class Circle extends Shape {
		
		public double radius;
		
		public Circle(double radius) {
			// width와 height를 반지름으로 설정
			super(radius, radius);
			this.radius= radius;
		}

		// width 난 height 필드를 사용해서 넓이 계산. 둘 다 써도 되고 하나만 서도 가능.
		public double calculateArea() {
			 return Math.PI * radius * radius;
		}
	}

	public static void main(String[] args) {
		Triangle triangle = new Triangle(5.0, 3.0); // 밑변이 5.0이고 높이가 3.0인 삼각형
		Rectangle rectangle = new Rectangle(4.0, 6.0); // 가로 길이가 4.0이고 세로 길이가 6.0인 사각형
		Circle circle = new Circle(3.0); // 반지름이 3.0인 원

		// 각 도형의 넓이 출력
		System.out.println("삼각형의 넓이: " + triangle.calculateArea()); // 삼각형의 넓이 출력
		System.out.println("사각형의 넓이: " + rectangle.calculateArea()); // 사각형의 넓이 출력
		System.out.println("원의 넓이: " + circle.calculateArea()); // 원의 넓이 출력
	}
}
