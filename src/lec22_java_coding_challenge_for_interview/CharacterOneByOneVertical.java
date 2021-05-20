package lec22_java_coding_challenge_for_interview;

public class CharacterOneByOneVertical {

	public static void main(String[] args) {

		String s = "Tofael";
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		System.out.println("\n------------------------- Adding character inside String --------------------------\n");

		String g = "";
		for (int i = 0; i < s.length(); i++) {
			if (i < s.length() - 1) {
				g = g + s.charAt(i) + "*";
			} else {
				g = g + s.charAt(i);
			}
		}
		System.out.println(g);

	}

}
