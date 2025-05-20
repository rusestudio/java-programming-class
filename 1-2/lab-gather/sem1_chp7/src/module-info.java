/**
 * 
 */
/**
 * 
 */
module chp7 {
}
//inheritance
// private field in parent class cnnot use in child class
// to use use set method or
// change to protected for filed

//use super.(var) to call parent class contructor in child class
//use super to get mehod in parent class

//overriding 
//Overriding deals with two methods, one in a parent class and 
//one in a child class, that have the same signature
// different with overloading

//abstract class/abstract method
// decalre abstract in parent class
// declare a method in parent class as abstract method
//perform the method later in child class, must use in child class
// abstract cannot 생성 object in main print

//polymorphism- many,multi shape,form

//inheritance child class can upcasting parent class
//when make object child class can upcasting
//ex: Shape s1 = new Rectangle();
//parent class cannot access child class field when upcasting.
//only child it class.
//s1.field cannot access
//rectangle r1 = new Rectangle();
//if r1.field- yes can access

//downcasting
//parent class s1 = new child class
//child class r1= new (childclass)s;

//binding- perform method and method body combine because
//we dont know which perform level need which method type. so combine both
//dynamic binding
// virtual method invocation

//is-a = inheritence
//has-a

//final class cannot be parent class, cannot be inheritence
//to protect info
//public final class myFinal{}
//final method, cannot be overriding, cannot change 
//final methodname()

//static method
//if override result change depend on parent or child class




















