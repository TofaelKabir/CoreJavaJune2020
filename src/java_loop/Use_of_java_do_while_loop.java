package java_loop;

public class Use_of_java_do_while_loop {

	public static void main(String[] args) {
		/*
		 * Loop contain: initialization block; Conditional block; Incremental or
		 * decremental block
		 */
		System.out.println("\n---------- for loop  ----------\n");
		for (int i = 0; i <= 5; i++) {
			System.out.println("The value is: " + i);
		}

		System.out.println("\n---------- while loop ----------\n");
		int i = 1;
		while (i <= 5) {// when the condition is true, the loop started
			System.out.println("The value is: " + i);
			i++;
		}
		
		System.out.println("\n---------- do while loop 01 ----------\n");
		int j = 1;
		do { // when the condition is true or false, the first loop will started
			System.out.println("The value is: " + j);
			j = j + 2;
		} while (j <= 5);

		System.out.println("\n---------- do while loop 02, condition is not true ----------\n");
		int k = 1;
		do {
			System.out.println("The value is: " + k);
			k++;
		} while (k >= 5); // as the condition is not true, loop stop after 1st iteration
		
		System.out.println("\n---------- do while loop 03 ----------\n");
		int l = 20;
		do {
			System.out.println("The values is: " + l);
			l = l - 3;
		} while (l >= 5);

	}

}
