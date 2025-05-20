package 실습12;

public class Zoo1 {
    
    // 부모 클래스 Animal
    public static class Animal {
        public void eat() {
        	System.out.println("eat()가  호출되었음");
        }
        public void sleep() {
        	System.out.println("sleep()가  호출되었음");
        }
    }

    // 자식 클래스 Dog
    public static class Dog extends Animal {
        public void run() {
        	System.out.println("run()가  호출되었음");
        }
    }

    // 자식 클래스 Eagle
    public static class Eagle extends Animal {
        public void fly() {
        	System.out.println("fly()가  호출되었음");
        }
    }

    // 메인 메소드
    public static void main(String[] args) {
        
    	Dog dog = new Dog();
    	Eagle eagle = new Eagle();
    	
    	dog.eat();
    	dog.run();
    	
    	eagle.sleep();
    	eagle.fly();
    	
    }
}
