package lec11_java_logical_statement;

public class CompareNumber01 {
	public static void main(String[] args) {
		int val1 = 45;
		int val2 = 35;
		// if else condition is related to boolean, generally false condition is written
		// first

		if (val1 == val2) {
			System.out.println("They are equal");

		} else {
			System.out.println("they are not equal");

		}

		if (val1 < val2) { // here (val1 < val2) is condition
			System.out.println(val1 + " is shorter than " + val2);
		} else { // here is no condition
			System.out.println(val1 + " is greater than " + val2);

		}
	}

}
