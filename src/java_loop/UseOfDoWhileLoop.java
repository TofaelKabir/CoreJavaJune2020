package java_loop;

public class UseOfDoWhileLoop {

	public static void main(String[] args) {
		int i = 1;
		// when the condition is true or false, the first loop will started
		do {
			System.out.println(i);
			i=i+2;
		} while (i <= 5);
		
		int j = 1;
		do {
			System.out.println("The values are: "+j);
			j++;
		} while (j >= 5); //as the condition is not true, loop stop after 1st try.
		System.out.println("****************");
		int k = 10;
		// when the condition is true or false, the first loop will started
		do {
			System.out.println("The values are: "+k);
			k=k-3;
		} while (k >= 5);
		
		

	}

}
