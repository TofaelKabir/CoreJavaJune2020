package lec22_java_coding_challenge_for_interview;

public class StringManipulation01 {
	/*
	 * Author: Shohag, Organised by: Tofael
	 * This is very important
	 */
	public static void main(String[] args) {
		String s = "My name is Nawshad";

		// To know the length (including space): length()
		System.out.println("The length of the String is: "+ s.length());

		// To know the character at a specific position: charAt()
		System.out.println("\nThe character at a specific position(0): " + s.charAt(0)); 
		System.out.println("The character at a specific position(2): " + s.charAt(2)); 
		System.out.println("The character at a specific position(5): " + s.charAt(5));

		// To know the position of the character in which index: indexOf()
		System.out.println("\nThe character 'M' is, at the position of: " + s.indexOf('M')); //start with 0
		System.out.println("The character 'N' is, at the position of: " + s.indexOf('N')); //case sensitive
		System.out.println("The character 'n' is, at the position of: " + s.indexOf('n'));
		System.out.println("The character 'a' is, at the position of: " + s.indexOf('a')); //if duplicated, the first own is recognized
		System.out.println("The character 'x' is, at the position of: " + s.indexOf('x')); //if any character is absent, it shows -1.

		// To know the position of the repetitive character in which index: indexOf('a',s.indexOf('a')+1))
		System.out.println("\nThe repetitive character 'a' is, at the position of: " + s.indexOf('a', s.indexOf('a') + 1));
//		System.out.println("\nThe 3rd repetitive character 'a' is, at the position of: " + s.indexOf('a', s.indexOf('a') + 2)); //ignore it
//		System.out.println("\nThe repetitive character 'a' is, at the position of: "+ s.indexOf('n', 3));

		
		// To know the index of a word:
		System.out.println("The index of 'My' word is: " + s.indexOf("My"));
		System.out.println("The index of 'Nawshad' word is: " + s.indexOf("Nawshad")); //case sensitive
		System.out.println("\nThe index of 'name' word is: " + s.indexOf("name"));
		// If we print the word or char doesn't exist
		System.out.println("The index of 'Hello' word is: " + s.indexOf("Hello")); // -1 (Dont say it will show ArrayIndexOutofBound exception
	
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(2, 9)); // 2 is initialized block, 9 is conditional block
		System.out.println(s.substring(4));
		System.out.println(s.substring(5,8));
	}
}
