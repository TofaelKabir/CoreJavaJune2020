package java_string_manipulation;

public class StringManipulation02 {
	/*
	 * Author: Tofael
	 */
	public static void main(String[] args) {
		String st1 =new String ("we are java programmer");
		System.out.println(st1.toUpperCase());
		String st2 =new String ("VERY INTERESTING!");
		System.out.println(st2.toLowerCase());
		String st3 =new String ("VERYINTERESTINGTOPICS!");
		System.out.println(st3.substring(2, 9)); //finished at 8
		System.out.println(st3.substring(4));
        System.out.println(st3.substring(5,8));
	}
}
