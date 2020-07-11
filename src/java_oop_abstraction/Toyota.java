package java_oop_abstraction;

public class Toyota extends FlyingCar implements Car, Drone{
		// a regular class can inherit only one regular class or
		// a regular class can inherit only one abstract class
		// a regular class can't inherit an Interface by extends key word
	
		// Implements keyword is used to inherit Interface in regular class
		// a regular class can inherit more than one Interface
		// a regular class cannot inherit a regular class or abstract class by implements keyword
	
	//when A regular class extends one regular class or abstract class and implements multiple 
	//interface, that regular class (Toyota) is called concrete class
	
	public void totyotaInfo() { //method implemented
		System.out.println("Invented in Japan");
		}

	@Override
	public void rent() { //from Taxi
		System.out.println("From Taxi Interface");
		
	}

	@Override
	public void carryingpassenger() { //from Taxi
		System.out.println("From Taxi Interface");
		
	}

	@Override
	public void carryingGoods() { //from Truck
		System.out.println("From Truck Interface");
		
	}

	@Override
	public void space() { //from Rocket, Rocket come from Flying Car
		System.out.println("From Rocket Interface");
		
	}

	@Override
	public void canFloat() { //from HoverCar, Hover car come from Flying Car
		System.out.println("From HoverCar Interface");
		
	}

	@Override
	public void lightWeight() { //From Drone
		System.out.println("From Drone Interface");
		
	}

	@Override
	public void start() {  //from Car
		System.out.println("From Car Interface");
		
	}

	@Override
	public void stop() { //from Car
		System.out.println("From Car Interface");
		
	}

	@Override
	public void brake() { //from Car
		System.out.println("From Car Interface");
		
	}

	@Override
	public void autoPilot() { //from FlyingCar
		System.out.println("From Flying Car Abstract class");
		
	}

	@Override
	public void price() { // From Electric Car, electric car from Flying Car, 
		System.out.println("From Electric Car Abstract class");
		
	}

	@Override
	public void speed() { // From Solar car, Solar Car from Ferrari, Ferrari from Electric car
		System.out.println("From Solar Car Abstract class");
		
	}

}
