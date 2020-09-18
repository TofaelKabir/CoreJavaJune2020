package lec12_java_loop;

public class Use_of_java_for_loop {

	public static void main(String[] args) {

/*
 * Loop contain: initialization block; Conditional block; Incremental or decremental block
 */

		System.out.println("\n---------- for loop 01  ----------\n");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("\n---------- for loop 02  ----------\n");
		for (int i = 1; i <= 10; i = i + 2) { // i = i + 2 -- means increment by 2
			System.out.println(i);
		}

		System.out.println("\n---------- for loop 03  ----------\n");
		for (int i = 1; i < 10; i = i + 3) { // i = i + 3 -- means increment by 3
			System.out.println("The values are: " + i);
		}

		System.out.println("\n---------- for loop 04  ----------\n");
		int j = 3;
		for (int i = 1; i < 10; i = i + 3) {
			System.out.println("The values are: " + i * j);
		}

		System.out.println("\n---------- for loop 05  ----------\n");
		for (int i = 15; i >= 8; i--) { // i-- means decrement by 1
			System.out.println(i);
		}
		
		System.out.println("\n---------- for loop 06  ----------\n");
		int k = 4;
		for (int i = 15; i >= 10; i = i - 2) { // i=i-2 --> means decrement by 2
			System.out.println("The values are: " + i * k);
		}

	}

}
