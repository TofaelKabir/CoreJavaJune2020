package java_loop;

public class UseOfForLoop {

	
	
	public static void main(String[] args) {
		
		for(int i=1; i<10; i=i+3) {
			System.out.println(i);
			if (i==7) {
				System.out.println("7 is present here");
			}
		}
		
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		int a = 7;
		int b = 8;
		
			if (a == b) {
				System.out.println("equal");
			} else {
				System.out.println("not equal");
			}
		

		/*
		 * Loop contain: initialization block; Conditional block; Incremental or
		 * decremental block
		 * 
		 */
		// 1st way

		for (int i = 0; i < 10; i++) {
			System.out.println(i);

		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// 2nd way
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		// 3rd way
		for (int i = 1; i < 10; i = i + 3) {
			System.out.println("The values are: " + i);
		}
		// 4th way
		int j = 3;
		for (int i = 1; i < 10; i = i + 3) {
			System.out.println("The values are: " + i * j);
		}
		// 5th way
		for (int i = 15; i >= 10; i--) {
			System.out.println(i);
		}
		// 6th way
		int k = 4;
		for (int i = 15; i >= 10; i = i - 2) {
			System.out.println("The values are: " + i * k);
		}
	}

}
