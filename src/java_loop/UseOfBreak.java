package java_loop;

public class UseOfBreak {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("The values are: "+i);
		}
		System.out.println("****** After the break values are ******");
		for (int j = 1; j <= 5; j++) {
			if  (j == 4) {
			    break;//when we use break, then the loop is completed before that
				  }
				System.out.println("The values are: "+j);
			}

	}

}
