package java_loop;

public class UseOfForLoop {

	public static void main(String[] args) {

		/*
		 * Loop contain: initialization block; Conditional block; Incremental or
		 * decremental block
		 */

		// 1st way

		for (int i = 0; i < 10; i++) {
			System.out.println(i);

		}

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		// 2nd way
		for (int i = 1; i <= 10; i = i + 2) { // i = i + 2 -- means increment by 2
			System.out.println(i);
		}

		// 3rd way
		for (int i = 1; i < 10; i = i + 3) { // i = i + 3 -- means increment by 3
			System.out.println("The values are: " + i);
		}

		// 4th way
		int j = 3;
		for (int i = 1; i < 10; i = i + 3) {
			System.out.println("The values are: " + i * j);
		}

		// 5th way
		for (int i = 15; i >= 8; i--) { // i-- means decrement by 1
			System.out.println(i);
		}
		// 6th way
		int k = 4;
		for (int i = 15; i >= 10; i = i - 2) { // i=i-2 -- means decrement by 2
			System.out.println("The values are: " + i * k);
		}
	}

}
