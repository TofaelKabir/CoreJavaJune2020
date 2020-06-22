package oop_abstraction;

public interface Car extends Taxi, Truck { // interface name is always in upper case
	// all these methods which are declared also called abstract method
	// an Interface can inherit more than one Interface
	// an Interface can't inherit a regular class or an abstract class
	public abstract void start(); //method declared in a interface but can't be implemented
	public void stop(); // we can write abstract inside the method or not.
	public void brake();
	
}
