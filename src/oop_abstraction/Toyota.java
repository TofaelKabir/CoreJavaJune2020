package oop_abstraction;

public class Toyota extends FlyingCar implements Car, Taxi{
		// a regular class can inherit only one regular class or
		// a regular class can inherit only one abstract class
		// a regular class can't inherit an Interface by extends key word
	
		// Implements keyword is used to inherit Interface in regular class
		// a regular class can inherit more than one Interface
		// a regular class cannot inherit a regular class or abstract class by implements keyword
	
	public void totyotaInfo() { //method implemented
		System.out.println("Invented in Japan");
		}

}
