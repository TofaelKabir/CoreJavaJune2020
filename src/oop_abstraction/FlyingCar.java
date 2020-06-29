package oop_abstraction;

public abstract class FlyingCar extends ElectricCar implements Truck {
	
	// an abstract class can inherit only one abstract class or
	// an abstract class can inherit only one regular class
	// an abstract class can't inherit an Interface by extends key word
	
	// Implements keyword is used to inherit Interface in abstract class
			// an abstract class can inherit more than one Interface
			// an abstract class cannot inherit a regular class or abstract class by implements keyword
	
	public void flyingFeature() { //method implemented
		System.out.println("Flying feature of Flying Car");
	}
	
	public abstract void autoPilot(); //method declared
	//we must have to put abstract keyword inside abstract method in abstract class

}
