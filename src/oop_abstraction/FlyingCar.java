package oop_abstraction;

public abstract class FlyingCar extends ElectricCar{
	
	// an abstract class can inherit only one abstract class or
	// an abstract class can inherit only one regular class
	// an abstract class can't inherit an Interface by extends key word
	
	public void flyingFeature() { //method implemented
		System.out.println("Flying feature of Flying Car");
	}
	
	public abstract void autoPilot(); //method declared
	//we must have to put abstract keyword inside abstract method in abstract class

}
