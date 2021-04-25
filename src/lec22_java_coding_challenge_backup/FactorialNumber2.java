package lec22_java_coding_challenge_backup;

//6! = 1*2*3*4*5*6

public class FactorialNumber2 {

	public static int factorial(int m) {
		int result = 1;
		for (int i = 1; i <= m; i++) {
			result = result * i;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(factorial(6));

	}

}
