package week12;

public class Figure2 {

	public static class Shape {
		public double width; // 도형의 너비
		public double height; // 도형의 높이

		// Shape 클래스의 생성자
		public Shape(double width, double height) {

		}
	}

	public static class Rectangle extends Shape {

		// Rectangle 클래스의 생성자
		public Rectangle(double width, double height) {

		}

		public double calculateArea() {

		}
	}

	public static class ColoredRectangle extends Rectangle {
		public String color;

		public ColoredRectangle(double width, double height, String color) {

		}

		public String getColor() {

		}
	}

	public static class Circle extends Shape {

		public Circle(double radius) {

		}

		public double calculateArea() {

		}

	}

	public static class Cylinder extends Circle {
		private double height;

		public Cylinder(double radius, double height) {

		}

		//Circle 클래스의 calculateArea 메소드 반드시 사용!
		public double calculateVolume() {

		}
	}

	// 메인 메소드는 각 도형의 넓이를 계산하고 출력하는 역할을 수행합니다.
	public static void main(String[] args) {
		// Rectangle과 ColoredRectangle 객체 생성
		Rectangle rectangle = new Rectangle(4.0, 6.0); // 가로 길이가 4.0이고 세로 길이가 6.0인 사각형
		ColoredRectangle coloredRectangle = new ColoredRectangle(5.0, 3.0, "Red"); // 가로 길이가 5.0이고 세로 길이가 3.0이며 빨간색인 색상이 있는 사각형
		Circle circle = new Circle(3.0); // 반지름이 3.0인 원
		Cylinder cylinder = new Cylinder(3.0, 5.0); // 반지름이 3.0이고 높이가 5.0인 원기둥

		// 각 도형의 넓이와 색상 출력
		System.out.println("사각형의 넓이: " + rectangle.calculateArea()); // 사각형의 넓이 출력
		System.out.println("색상이 있는 사각형의 넓이: " + coloredRectangle.calculateArea()); // 색상이 있는 사각형의 넓이 출력
		System.out.println("색상이 있는 사각형의 색상: " + coloredRectangle.getColor()); // 색상이 있는 사각형의 색상 출력
		System.out.println("원의 넓이: " + circle.calculateArea()); // 원의 넓이 출력
		System.out.println("원기둥의 부피: " + cylinder.calculateVolume()); // 원기둥의 부피 출력
	}
}