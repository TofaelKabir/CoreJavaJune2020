package lec22_java_coding_challenge_for_interview;

public class Practice {
	
	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,7,8,9};
		int sum = 0;
		for(int i=0; i<array.length;i++) {
			sum  = sum +array[i];
		}
		int total = 0;
		for(int j=1; j<=9; j++) {
			total = total+j;
		}
		System.out.println(total-sum);

	}

}