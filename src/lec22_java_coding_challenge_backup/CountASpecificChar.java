package lec22_java_coding_challenge_backup;

// Q: Count how many 'a' is present in the string "aabba'

public class CountASpecificChar {

	public static void main(String[] args) {
		String s = "aabbacdaaswa";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println(count);

	}

}
