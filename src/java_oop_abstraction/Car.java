package java_oop_abstraction;

public interface Car extends Taxi, Truck { // interface name is always in upper case
	// all these methods which are declared also called abstract method
	// an Interface can inherit more than one Interface
	// an Interface can't inherit a regular class or an abstract class
	
	//implements keyword can't be used for inheritance in Interface
	
	public abstract void start(); //method declared in a interface but can't be implemented
	public void stop(); // we can write abstract inside the method or not.
	public void brake();
	
	// from Java 1.8, they implemented static and default method inside interface
	public default void honk() { //default method
		System.out.println("honk feature");
	}
	public static void gear() { //static method
		System.out.println("gear feature");
	}
	
	
}
