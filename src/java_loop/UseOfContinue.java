package java_loop;

public class UseOfContinue {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("The values are: "+i);
		}
		System.out.println("****** After the Continue values are ******");
		for (int j = 1; j <= 5; j++) {
			if  (j == 3) {
			    continue; //when we use continue, then we avoid that condition and continue the loop
				  }
				System.out.println("The values are: "+j);
			}
		System.out.println("****** After the Continue values are ******");
		for (int k = 1; k <= 5; k++) {
			if  (k%2 == 0) {
			    continue;
				  }
				System.out.println("The values are: "+k);
			}

	}

}
