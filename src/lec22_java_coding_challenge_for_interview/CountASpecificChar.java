package lec22_java_coding_challenge_for_interview;

// Q: Count how many 'a' is present in the string "Aabbacdaaswaeiou" regardless of upper case of lower case?


public class CountASpecificChar {

	public static void main(String[] args) {
		String s = "Aabbacdaaswaeiou";
		
// mistake: count is int type.		
		int count = 0;
// mistake happen in if condition
		for (int i = 0; i < s.length(); i++) {
// mistake: forgot single quotation 'w'			
			if (s.toLowerCase().charAt(i) == 'a') {
				count++;
			}
		}
// Mistake: below println outside for loop
		System.out.println(count);

		
		
		
		
		
		
		
//		Another way
		
		System.out.println("\n------------------------ Changed all the charcaters to lowercase and find a ---------------------------\n");
		
		String s1 = "Aabbacdaaswaeiou";
		// mistake: count is int type.		
				int count1 = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (Character.toLowerCase(s1.charAt(i)) == 'a') {
				count1++;
			}
		}
		System.out.println(count1);

	}

}
