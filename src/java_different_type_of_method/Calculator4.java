package java_different_type_of_method;

public class Calculator4 {
		// return type method
		public int addition(int a, String b) {
		int total1 = a+(Integer.parseInt(b));//to turn a string to integer we have to use this formula
		System.out.println("Addition of a & b: "+total1);
		return total1;
	}

}

//Sring to Integer --
// Integer.parseInt(b)

