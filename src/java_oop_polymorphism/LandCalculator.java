package java_oop_polymorphism;

public class LandCalculator { // Method overloading
	// Method overloading(same method name but different type of parameter)
	// Early binding or static binding or compile time polymorphism.
	// String landName, no need to declare or initialize

	// Return type Method (1) declared
	public int areaOfLand(int a, int b, int c) { // if you write like (int c, int b, int a), it will not work
		int total = a + b + c; 
		System.out.println("Local Calculator: " + total);
		return total;
	}

	// Return type Method (2) declared
	public int areaOfLand(int b, int a) { //same method name but different signature, in different orientation
		int total = b + a;
		System.out.println("Local Calculator: " + total);
		return total;
	}

	// Return type Method (3) declared but one of the signature is String type
	public int areaOfLand(int a, int b, String landName) {
		int value = Integer.parseInt(landName);
		int total = a + b + value; // need to know how?
		System.out.println("Local Calculator: " + total);
		return total;
	}

	// Final type Method (4) declared **********
	// Final method can be overloaded
	public final int areaOfLand(int a, int b, int c, int d) {
		int total = a + b + c + d;
		System.out.println("Local Calculator: " + total);
		return total;
	}

	// Static type Method (5) declared
	// Static method can be overloaded
	public static int areaOfLand(int a, int b, int c, int d, int e) {
		int total = a + b + c + d + e;
		System.out.println("Local Calculator: " + total);
		return total;
	}
	// void type method (6) is declared
	public void areaOfLand(int a, int b, int c, int d, int e, int f) {
		int total = a + b + c + d + e+f;
		System.out.println("Local Calculator: " + total);
	}
	// void type method (7) is declared
	public void areaOfLand() {
		System.out.println("Local Calculator");
	}

}
