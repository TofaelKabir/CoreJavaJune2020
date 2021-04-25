package lec22_java_coding_challenge_for_interview;

public class CharacterOneByOneVerticalAndReverse {

	public static void main(String[] args) {
		
		String s = "Tofael";
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		System.out.println("\n---------------------------------------------------\n");
		
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
		
		

	}

}
