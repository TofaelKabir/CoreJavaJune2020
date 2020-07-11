package java_oop_polymorphism;

public class LandCalculator { // Method overloading
	// Method overloading -- (same method name but different type of parameter/signature or different combination of parameter)
	// Different name: Early binding or static binding or compile time polymorphism.
	

	// Return type Method (1) implemented
	public int areaOfLand(int a, int b, int c) { // if you write like (int c, int b, int a), it will not work
		int total = a + b + c; 
		System.out.println("Local Calculator: " + total);
		return total;
	}

	// Return type Method (2) implemented
	public int areaOfLand(int b, int a) { //same method name but different signature, in different orientation
		int total = b + a;
		System.out.println("Local Calculator: " + total);
		return total;
	}

	// Return type Method (3) implemented but one of the signature is String type
	public int areaOfLand(int a, int b, String landName) {
		int total = a + b + Integer.parseInt(landName); 
		System.out.println("Local Calculator: " + total);
		return total;
	}

	// Final type Method (4) implemented
	// Final method can be overloaded
	public final int areaOfLand(int a, int b, int c, int d) {
		int total = a + b + c + d;
		System.out.println("Local Calculator: " + total);
		return total;
	}

	// Static type Method (5) implemented
	// Static method can be overloaded
	public static int areaOfLand(int a, int b, int c, int d, int e) {
		int total = a + b + c + d + e;
		System.out.println("Local Calculator: " + total);
		return total;
	}
	// void type parameterized method (6) is implemented
	public void areaOfLand(int a, int b, int c, int d, int e, int f) {
		int total = a + b + c + d + e+f;
		System.out.println("Local Calculator: " + total);
	}
	// void type method (7) is implemented
	public void areaOfLand() {
		System.out.println("Local Calculator");
	}

}
