package lec22_java_coding_challenge_for_interview;

public class CharacterOneByOne {

	public static void main(String[] args) {
		
		String s = "Tofael";
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		String g = "";
		for (int i = 0; i < s.length(); i++) {
			g = g + "-" + s.charAt(i);
		}
		System.out.println(g);

	}

}
