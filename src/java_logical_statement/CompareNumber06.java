package java_logical_statement;

public class CompareNumber06 {
	public static void main(String[] args) {
		int val = 45;
		
		if (val%2==0) { // % is called modulus/remainder
			System.out.println(val + " is an even number ");
		} else if (val%2==1) { //if no condition, then we have to use only else
			System.out.println(val + " is an odd number ");
		
		}
	}

}
