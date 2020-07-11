package java_oop_abstraction;

public class TestVehicle {

	public static void main(String[] args) {
		System.out.println("\n---------------------------------------------");
		Toyota toyota = new Toyota(); // the Totyota class is instantiated here
		toyota.totyotaInfo();
		toyota.flyingFeature();
		toyota.autoPilot();
		toyota.start();
		toyota.stop();
		toyota.brake();
		toyota.honk();
		// toyota.gear(); // not possible because this is a static method
		// Static method don't need an object to call, A class/Interface directly can call a static method
		Car.gear();
		toyota.rent();
		toyota.carryingpassenger();
		toyota.carryingGoods();
		toyota.lightWeight();
		toyota.price();
		toyota.battery();
		toyota.ferrariInfo();
		toyota.speed();
		toyota.solarInfo();
		toyota.speed();
		toyota.mercedezInfo();
		
		System.out.println("\n---------------------------------------------");
		
		Car car = new Toyota(); // an interface can't be instantiated, it needs the help of a concrete class
		car.start();
		car.stop();
		car.brake();
		car.honk();
		//car.gear(); // not possible because this is a static method
		// Static method don't need an object to call, A class/Interface directly can call a static method
		Car.gear(); // here Car is interface
		car.rent();
		car.carryingpassenger();
		car.carryingGoods();
		
		System.out.println("\n---------------------------------------------");
		Taxi taxi = new Toyota(); // an interface can't be instantiated, it needs the help of a concrete class
		taxi.rent();
		taxi.carryingpassenger();
		
		System.out.println("\n---------------------------------------------");
		FlyingCar flyingCar = new Toyota(); // an abstract class can't be instantiated, it needs the help of a concrete class
		flyingCar.flyingFeature();
		flyingCar.autoPilot();
		flyingCar.price();
		flyingCar.battery();
		flyingCar.ferrariInfo();
		flyingCar.speed();
		flyingCar.solarInfo();
		flyingCar.space();
		flyingCar.canFloat();
		
		System.out.println("\n---------------------------------------------");
		ElectricCar electricCar = new Toyota();
		electricCar.price();
		electricCar.battery();
		electricCar.ferrariInfo();
		electricCar.speed();
		electricCar.solarInfo();
		electricCar.mercedezInfo();
		
		System.out.println("\n---------------------------------------------");
		Ferrari ferrari = new Ferrari();
		ferrari.ferrariInfo();
		ferrari.speed();
		ferrari.solarInfo();
		ferrari.speed();
		ferrari.mercedezInfo();
		
		//it is possible to call all the regular class, interface and abstract class
		//I didn't initialize them all
		// i just initialize 2 regular class, 2 abstract class, 2 interface
		// You must finish the HW related to abstract class.
	}

}
