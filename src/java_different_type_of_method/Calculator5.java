package java_different_type_of_method;

public class Calculator5 {

		public int addition(String c, int a, String b) {
		int total1 = (Integer.parseInt(c))+ a+(Integer.parseInt(b));//to turn a string to integer we have to use this formula
		System.out.println("Addition of a & b & c: "+total1);
		return total1;
	}

}
