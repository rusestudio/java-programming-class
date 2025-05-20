package week13;

class Book {

}

class Test {
    public static void main(String[] args) {
        Book book1 = new Book("Effective Java", "Joshua Bloch");
        Book book2 = new Book("Effective Java", "Joshua Bloch");
        Book book3 = new Book("Java Concurrency in Practice", "Brian Goetz");

        // Book 객체 비교
        System.out.println("book1.equals(book2): " + book1.equals(book2)); // true
        System.out.println("book1.equals(book3): " + book1.equals(book3)); // false

    }
}