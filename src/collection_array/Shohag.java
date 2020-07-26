package collection_array;

import java.util.Arrays;

public class Shohag {

	public static void main(String[] args) {
		int[] a = new int[10];

//		for(int i=0; i<10; i++) {
//			a[i]= i*5;
//			
//		}
//		System.out.println(Arrays.toString(a));

		for (int i = 0; i < 10; i++) {
			a[i] = i * 5;

			if (a[i] < 30) {
				System.out.println(Arrays.toString(a));
			}

		}
	}
}
