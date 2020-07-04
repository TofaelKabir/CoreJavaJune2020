package java_different_type_of_method;

public class Calculator2 {
	
	int a = 50;
	int b = 30;
	
	// return type method
	public int addition() {
		int total1 = a+b;
		System.out.println("Addition of a & b: "+total1);
		return total1;
	}
	
	public int subtraction( ) {
		int total2 = a-b;
		System.out.println("Subtraction of a & b: "+total2);
		return total2;
	}
}
