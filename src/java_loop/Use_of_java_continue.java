package java_loop;

// https://www.edureka.co/blog/java-continue-statement/#:~:text=Java%20continue%20statement%20is%20allowed,code%20at%20that%20specific%20condition.

public class Use_of_java_continue {

	public static void main(String[] args) {
		System.out.println("\n---------- for loop  ----------\n");
		for (int i = 1; i <= 5; i++) {
			System.out.println("The values is: " + i);
		}

		System.out.println("\n---------- for loop after continue 01  ----------\n");
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue; // when we use continue, then we avoid that condition and continue the loop
			}
			System.out.println("The value is: " + i);
		}

		System.out.println("\n---------- for loop after continue 02  ----------\n");
		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("The value is: " + i);
		}

		System.out.println("\n---------- while loop ----------\n");
		int i = 1;
		while (i <= 5) {// when the condition is true, the loop started
			System.out.println("The value is: " + i);
			i++;
		}

		System.out.println("\n---------- while loop after continue ----------\n");
		int j = 1;
		while (j <= 7) {
			if (j == 5) {
				j++;
				continue;
			}
			System.out.println("The value is: " + j);
			j++;
		}

		System.out.println("\n---------- do while loop ----------\n");
		int k = 1;
		do {
			System.out.println("The value is: " + k);
			k = k + 2;
		} while (k <= 7);

		System.out.println("\n---------- do while loop after continue ----------\n");
		int l = 1;
		do {
			if (l == 5) {
				l=l+2;
				continue;
			}
			System.out.println("The value is: " + l);
			l = l + 2;
		} while (l <= 7);

	}

}
