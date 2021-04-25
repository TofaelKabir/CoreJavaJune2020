package lec22_java_coding_challenge_for_interview;



public class APractice {
	
	public static void makePyramid(int n) {
		for (int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k<=i; k++) {
				System.out.print("* " );
			}
			System.out.println();
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		makePyramid(5);
		
		
		
		
		
		
	}

}
