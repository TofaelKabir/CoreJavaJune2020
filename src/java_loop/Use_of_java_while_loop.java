package java_loop;

public class Use_of_java_while_loop {

	public static void main(String[] args) {
		/*
		 * Loop contain: initialization block; Conditional block; Incremental or Decremental block
		 */
		System.out.println("\n---------- for loop  ----------\n");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("\n---------- while loop 01 ----------\n");
		int i = 1;
		while (i <= 10) {// when the condition is true, the loop started
			System.out.println("The value is: " + i);
			i++;
			// i+=1; //we can also write like this way
			// i=i+1; //we can also write like this way
		}

		System.out.println("\n---------- while loop 02 ----------\n");
		int j = 3;
		while (j <= 10) {
			System.out.println("The value is: " + j);
			j = j + 2;
		}
		System.out.println("\n---------- while loop 03 ----------\n");
		int k = 10;
		while (k >= 5) {
			System.out.println("The value is: " + k);
			k--;
		}
		System.out.println("\n---------- while loop 04 ----------\n");
		int m = 2;
		int l = 11;
		while (l > 5) {
			System.out.println("The value is: " + l * m);
			l = l - 2;
			// l-=2; //we can also write like this way

		}
	}

}
