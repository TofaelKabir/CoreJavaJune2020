package lec22_java_coding_challenge_backup;

public class Practice {
	public static void main(String[] args) {
		String a = "Mohammad";
		String r = "";
		System.out.println("Length: "+ a.length());
		System.out.println("Length: "+ a.indexOf(0));
		System.out.println(a.charAt(1));
		for (int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i));
		}
		
		for (int i = a.length()-1; i>=0; i--) {
			r = r + a.charAt(i);
		}
		System.out.println(r);
	}

}
