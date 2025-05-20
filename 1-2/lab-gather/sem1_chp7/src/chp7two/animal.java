package chp7two;

public class animal {
	public void sound() {
		System.out.println("Animal 클래스의 sound()"); 
		} 
		}
		class Dog extends animal { 
		public void sound() { // override
		System.out.println("멍멍"); 
		} 
		}
		class Cat extends animal { 
		public void sound() { // override
		System.out.println("야옹");
}}
