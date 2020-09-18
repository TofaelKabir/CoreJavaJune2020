package lec12_java_loop;

public class Use_of_nested_for_loop {

	public static void main(String[] args) {
		System.out.println("\n---------- nested for loop  ----------\n");
		for (int i = 1; i <= 3; i++) { //outer loop
			for (int j = 10; j <= 13; j++) { //inner loop
//				System.out.println(i);
//				System.out.println(j);
				System.out.println(i*j);
				
			}
			
		}

	}

}
