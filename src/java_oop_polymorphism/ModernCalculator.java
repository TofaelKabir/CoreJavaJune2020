package java_oop_polymorphism;

public class ModernCalculator extends LandCalculator {
	// summary: same method name, same signature/parameter but Overriding the logic of the method
	// Method overriding(same method name, same parameter but different syntax or logic)
	// Also called -- Late binding or dynamic binding or runtime polymorphism

	@Override // method 1
	public int areaOfLand(int a, int b, int c) {
		int total = a + b + c + 7;
		System.out.println("Modern Calculator: " + total);
		return total;
	}

	@Override // method 2
	public int areaOfLand(int b, int a) {
		int total = b + a - 4;
		System.out.println("Modern Calculator: " + total);
		return total;
	}

	@Override // method 3
	public int areaOfLand(int a, int b, String landName) {
		int value = Integer.parseInt(landName);
		int total = a + b + value - 6;
		System.out.println("Modern Calculator: " + total);
		return total;
	}

//	@Override //Final type Method (4) declared 
//	public final int areaOfLand(int a, int b, int c, int d) { // can't override a final method
//		int total = a + b + c + d;
//		System.out.println("Modern Calculator: " + total);
//		return total;
//	}

	 //@Override //Static type Method (5) implemented
	 //The method areaOfLand of type ModernCalculator must override or implement a
	 //super type method (from super type class), not a static method (because static is a local method of a class)
	 //So, static method can't be override, if we remove @override it will work as
	 //static method of this modern calculator class
	public static int areaOfLand(int a, int b, int c, int d, int e) {
		int total = a + b + c + d + e;
		System.out.println("Modern Calculator: " + total);
		return total;
	}

	@Override // method 6
	public void areaOfLand(int a, int b, int c, int d, int e, int f) {
		int total = a + 7+ b + c + d + e + f - 6; // we can delete a, b or c here, add number in between, can't change a to 2a etc
		System.out.println("Modern Calculator: " + total);
	}

	@Override // method 7
	public void areaOfLand() {
		System.out.println("Modern Calculator");
	}

}
