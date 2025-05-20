package chp7two;

public class animal2 {

	public static void eat() {
		System.out.println("Animal의 정적 메소드 eat()");
		}
		public void sound() {
		System.out.println("Animal의 인스턴스 메소드 sound()");
}}

 class Cat2 extends animal2 {
public static void eat() { // 정적 메소드 eat() 재정의
System.out.println("Cat의 정적 메소드 eat()");
}
public void sound() { // 인스턴스 메소드 sound() 재정의
System.out.println("Cat의 인스턴스 메소드 sound()");
}}
