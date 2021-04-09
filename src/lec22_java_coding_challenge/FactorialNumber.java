package lec22_java_coding_challenge;

// Recursive method
// 7! = 7*6*5*4*3*2*1

public class FactorialNumber {

	public static int recFactorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * recFactorial(n - 1);
		}

	}
	public static int Factorial(int n){
        int total = n;
        for (int i = n-1; i >=1;i--){
            total = total*i;
        }
        return total;
    }
	

	public static void main(String[] args) {
		System.out.println(recFactorial(7));
		System.out.println(Factorial(5));

	}

}

    

    

    