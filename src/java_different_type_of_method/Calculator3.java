package java_different_type_of_method;

public class Calculator3 {
	
	// return type parameterized method 
	public int addition(int a, int b) {// int type method
		int total1 = a+b;
		System.out.println("Addition of a & b: "+total1);
		return total1;
	}
	public int subtraction(int a, int b ) {
		int total2 = a-b;
		System.out.println("Subtraction of a & b: "+total2);
		return total2;
	}
}
