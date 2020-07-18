package java_oop_polymorphism;

public class TestCalculator {

	public static void main(String[] args) {
		System.out.println("\n................. Method overloading .................\n");
		LandCalculator cal = new LandCalculator();
		cal.areaOfLand(10, 27, 234); //Method 1 initialize // when we put the value, they called argument
		cal.areaOfLand(27, 10); //Method 2 initialize
        cal.areaOfLand(10, 27, "41"); //Method 3 initialize
        cal.areaOfLand(10, 27, 41, 24); //Final Method (4) initialize
        LandCalculator.areaOfLand(10, 27, 41, 24, 23); //Static Method (5) initialize by class directly
        cal.areaOfLand(10, 27, 41, 24, 21, 32); // void method (6) is initialize
        cal.areaOfLand();
        
        System.out.println("\n................ Method overriding .................\n");
        ModernCalculator mcal = new ModernCalculator();
	    mcal.areaOfLand(10, 27, 234);
	    mcal.areaOfLand(27, 10);
	    mcal.areaOfLand(10, 27, "41");
	    ModernCalculator.areaOfLand(10, 27, 41, 24, 23); 
	    mcal.areaOfLand(10, 27, 41, 24, 21, 32);
	    mcal.areaOfLand();
	}

}
