package java_loop;

public class Use_of_java_for_each_loop {

	public static void main(String[] args) {
		int[] a = new int[7];

		a[0] = 5;
		a[1] = 15;
		a[2] = 50;
		a[3] = 'j'; // see below

		a[5] = 56;

		for (int s : a) {
			System.out.println(s);
		}

	}

}
