package lec22_java_coding_challenge_backup;

public class StringManipulation02 {
	/*
	 * Author: Tofael
	 */
	public static void main(String[] args) {
		String s1 = "we are java programmer";
		System.out.println(s1.toUpperCase());
		
		String s2 = "VERY INTERESTING!";
		System.out.println(s2.toLowerCase());
		
		String s3 = "VERYINTERESTINGTOPICS!";
		System.out.println(s3.substring(2, 9)); // 2 is initialized block, 9 is conditional block
		
		System.out.println(s3.substring(4)); // initialization block 4
        
		System.out.println(s3.substring(5,8));
		
		// all of them is done in first class
	}
}
