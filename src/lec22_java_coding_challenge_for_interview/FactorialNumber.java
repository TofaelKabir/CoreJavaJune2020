package lec22_java_coding_challenge_for_interview;

// Recursive method
// 7! = 7*6*5*4*3*2*1

public class FactorialNumber {

	public static int recFactorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * recFactorial(n - 1);
		}
//mistake: recFactorial in line 12
	}
	public static int rFactorial(int n){
        int total = n; //mistake
        for (int i = n-1; i >=1;i--){
            total = total*i; //mistake
        }
        return total;
    }
	
	public static int factorial(int m) {
		int result = 1;
		for (int i = 1; i <= m; i++) {
			result = result * i;
		}
		return result;
	}
	

	public static void main(String[] args) {
		System.out.println(recFactorial(5));
		System.out.println(rFactorial(5));
		System.out.println(factorial(4));

	}

}

    

    

    