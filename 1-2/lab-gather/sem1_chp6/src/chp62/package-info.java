package chp62;

///initialize constructor
//public class MyClass {
//private int value;
// Constructor initializing the 'value' field
//public MyClass(int val) {
//    this.value = val;
//}
//}

///field initialize
//public class MyClass {
// Field initialization at the point of declaration
//private int value = 10;
//}

///instance initializer block
//public class MyClass {
//private int value;
// Instance initializer block
//{value = 10; // Initialization logic
//}}

///array n object passing
//public class Example {
// Method to compute average of array elements
//public static double computeAverage(int[] arr) {
//    int sum = 0;
//   for (int num : arr) {
//       sum += num;
//    }
//    return (double) sum / arr.length;
//}
//public static void main(String[] args) {
//  int[] myArray = {1, 2, 3, 4, 5};
//   System.out.println("Average: " + computeAverage(myArray));
//}
//}

///static member
//public class Counter {
//private static int count = 0; // Static variable
//public Counter() {
//  count++; // Incrementing count each time an object is created
//}
//public static void main(String[] args) {
//    Counter c1 = new Counter();
 //   Counter c2 = new Counter();
 //   System.out.println("Number of instances created: " + count);
//}}

///instance vs static member
//public class MyClass {
    // Instance variable
  //  private int instanceVar;

    // Static variable
  //  private static int staticVar;

  //  public void myMethod() {
        // Instance method accessing instance variable
   //     instanceVar = 10;

        // Instance method accessing static variable
     //   staticVar = 20;
  //  }}

/// static method
// The example of Math.sqrt(9.0) illustrates this concept, 
//where sqrt() is a static method of the Math class.
//public class MathExample {
 //   public static void main(String[] args) {
 //       double value = Math.sqrt(9.0); // Using static method Math.sqrt()
 //       System.out.println("Square root of 9 is: " + value);
 //   }}

///inner class
//public class OuterClass {
// Inner class
//class InnerClass {
 //   void display() {
 //       System.out.println("This is an inner class");
 //   }}

//public static void main(String[] args) {
//    OuterClass outer = new OuterClass();
//    OuterClass.InnerClass inner = outer.new InnerClass();
//    inner.display();
//}}

///example with inner class
//public class Character {
// Inner class representing an item
//class Item {
   // private String name;
   // private int power;

    // Constructor
   // public Item(String name, int power) {
   //     this.name = name;
   //     this.power = power;
 //   }

    // Getter methods
  //  public String getName() {
    //    return name;
  //  }

  //  public int getPower() {
  //      return power;
   // }
//}

//public static void main(String[] args) {
   // Character character = new Character();

    // Creating an item for the character
   // Character.Item sword = character.new Item("Sword", 50);

    // Accessing item properties
  //  System.out.println("Item Name: " + sword.getName());
  //  System.out.println("Item Power: " + sword.getPower());
//}}



